import scala.io.StdIn.readInt

class ProfilePicture {
  //This method is used to know the status of photo such as accepted, crop or upload other
  def setProfilePicture(pictureLength: Int, photoWidth: Int, photoHeight: Int): String = {
    if (photoWidth < pictureLength || photoHeight < pictureLength) {
      return "Upload another photo"
    }
    else if (photoWidth >= pictureLength && photoHeight >= pictureLength && photoWidth == photoHeight) {
      return "Accepted"
    }
    else {
      return "CROP IT"
    }
  }
}

//singleton object
object Main extends App {
  print("Enter the Length of Picture :")
  private val pictureLength = readInt()
  print("Enter the Width of Photo :")
  private val photoWidth = readInt()
  print("Enter the Height of Photo :")
  private val photoHeight = readInt()
  private val obj = new ProfilePicture
  try {
    if (pictureLength <= 0 || photoWidth <= 0 || photoHeight <= 0) {
      throw new ArithmeticException
    }
    val result: String = obj.setProfilePicture(pictureLength: Int, photoWidth: Int, photoHeight: Int)
    print(result)
  }
  catch {
    case ex: ArithmeticException => {
      print("Number should be greater than zero")
    }
  }
}
