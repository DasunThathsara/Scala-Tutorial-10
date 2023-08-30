package P10

object Q1 extends App{
  def calculateAverage(temp:List[Double]):Double={
    temp.map(C => (C * 9 / 5) + 32).reduce((x, y) => x + y) / temp.size;
  }

  println(calculateAverage(List(1, 2, 3, 4, 6)));
}
