class Foo {
  def bar(str1, str2){
    def result = 0
    for (int i = 0; i < str1.length(); i++){
      if (str1 != str2){
        result++
      }
    }
    return result as int

  }
}
def foo = new Foo()
print foo.bar("","")

print foo.bar("GGACTGAAATCTG","GGACTGAAATCTG")
