package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1930Test {
    val sut = P1930()

    @Test
    fun `example 1`() {
        assertThat(sut.countPalindromicSubsequence("aabca"), `is`(3))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.countPalindromicSubsequence("abc"), `is`(0))
    }

    @Test
    fun `example 3`() {
        assertThat(sut.countPalindromicSubsequence("bbcbaba"), `is`(4))
    }

    @Test
    fun `example 4`() {
        assertThat(
            sut.countPalindromicSubsequence("zqpppgacudvmqekmefkzyyfrffeylqrwxlupvskyonqsbclwwgnzbktzelwuhehxrxmqcnepxokialxxwciqsetcsqcsszpeobeiwwedtbisyhexyatammupmfrllpawhqvfebjdappicczehrsooztjatixvtvbmdwikffbozncspuslwgoqypmsmvwghfdmutfpkbjufqrgbhotcikoyvfvxmmadelwxmvybnoroapixubdvijnepeduiwshcwjvhnejafcnuxeimwiiucznzfakwdibwwixcttatqffhnurhecyocoohyuoeixobaxbjcksxqrljiftvcxtocusciqtmydxgjexiwimbcmvhjonkscobhlpggembfslzoisertsvcpiclikprpviqbfdptvtrlhqlfwhurxysxzppnwwbxzaozchalpqsklfedovjkhwdaqdxrzdduwxsyqllvkflamtshyoaamjpzcsnwthnnpgqrrroppxnalxoijzhesphugqporhtamdbugqhgtpxtrjeugenazzpvvtkjrsepvbgvbmmmyxgrkgnlhujinycnjvpqhhugplrgrunrziaabknrjsgaqbpxfpdycpjtquecehrblzurruguhbkzgvebzfkqcolpclgabsuamqaakdikasumksvbfjrudnzihbzqjwivthfozrhkcrmxleaazgkuqmzvzaiiskfrnywntgbtmaxqgqaqxvcpvbvcpqbfivtkdroizfbebhteje"),
            `is`(676)
        )
    }

    @Test
    fun `example 5`() {
        assertThat(
            sut.countPalindromicSubsequence("tlpjzdmtwderpkpmgoyrcxttiheassztncqvnfjeyxxp"),
            `is`(161)
        )
    }
}