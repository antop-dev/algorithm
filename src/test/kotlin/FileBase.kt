import com.google.gson.Gson
import java.nio.file.Files
import java.nio.file.Paths

abstract class FileBase {
    protected fun <T> readFile(path: String, clazz: Class<T>): T {
//        return Gson().fromJson(Files.readString(Paths.get(path)), clazz)
        return Gson().fromJson(Files.readAllLines(Paths.get(path))[0], clazz)
    }
}
