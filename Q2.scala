package P10

object Q2 extends App{
  def countLetterOccurrences(words: List[String]):Int={
    words.map(word => word.size).reduce((x, y) => x + y);
  }

  println(countLetterOccurrences((List("apple", "banana", "cherry", "date"))));
}
