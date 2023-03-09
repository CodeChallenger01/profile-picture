import org.scalatest.flatspec.AnyFlatSpec

class ProfilePictureTest extends AnyFlatSpec{
  val obj =new ProfilePicture
  it should "match with width and height grater than length of picture " in{
    assert("CROP IT"==obj.setProfilePicture(180,640,480))
  }
  it should "match with width and height less than length of picture" in{
    assert("Upload another photo"==obj.setProfilePicture(180,90,90))
  }
  it should "match with same width and height of photo" in{
    assert("Accepted"==obj.setProfilePicture(180,200,200))
  }
}
