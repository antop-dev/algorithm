package com.leetcode

// https://github.com/antop-dev/algorithm/issues/589
class P535 {
    private val base62 = Base62()
    private val repository = Repository()
    private val sequence = Sequence()
    private val tinyUrl = "https://tinyurl.com"

    fun encode(longUrl: String): String {
        val seq = sequence.next()
        val encoded = base62.encode(seq)
        repository.insert(seq, longUrl)
        return makeTinyUrl(encoded)
    }

    fun decode(shortUrl: String): String {
        val encoded = extractBase62(shortUrl)
        val seq = base62.decode(encoded)
        return repository.select(seq) ?: ""
    }

    private fun makeTinyUrl(base62: String) = "$tinyUrl/$base62"

    private fun extractBase62(shortUrl: String): String {
        return shortUrl.replace("$tinyUrl/", "")
    }

    class Repository {
        private val database = mutableMapOf<Long, String>()

        fun insert(seq: Long, longUrl: String) {
            database[seq] = longUrl
        }

        fun select(seq: Long) = database[seq]
    }

    class Sequence {
        // not thread safe
        private var num = 1L

        fun next(): Long = ++num
    }

    // https://leetcode.com/discuss/interview-question/124658/Design-a-URL-Shortener-(-TinyURL-)-System/
    class Base62 {
        private val chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"

        fun encode(num: Long) = buildString {
            var v = num
            while (v > 0) {
                val mod = v % 62
                val ch = chars[mod.toInt()]
                this.append(ch)
                v /= 62
            }
        }

        fun decode(s: String): Long {
            var v = 0L
            for (ch in s) {
                when (ch) {
                    in 'a'..'z' -> v = (v * 62) + (ch - 'a')
                    in 'A'..'Z' -> v = (v * 62) + (ch - 'A') + 26
                    in '0'..'9' -> v = (v * 62) + (ch - '0') + 52
                }
            }
            return v
        }
    }

}
