package utils

import com.google.gson.Gson
import java.nio.file.Files
import java.nio.file.Paths

class FileUtils {

    companion object {
        @JvmStatic
        fun <T> readFile(path: String, clazz: Class<T>): T {
            return readFile(path, 0, clazz)
        }

        @JvmStatic
        fun <T> readFile(path: String, line: Int, clazz: Class<T>): T {
            return Gson().fromJson(Files.readAllLines(Paths.get(path))[line], clazz)
        }
    }

}
