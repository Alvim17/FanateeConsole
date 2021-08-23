object Main {

  def main(args: Array[String]): Unit = {

    val filename = args(0)
    val universo = new Universo(filename)
    var entradaUsuario = "n"
    var origemDestino = new Array[String](2)
    var melhorRota = (0, List[String]())

    while(entradaUsuario == "n"){

      do {
        print("Please enter the route: ")
        entradaUsuario = readLine()      
        if(entradaUsuario.split("-").length != 2)
        println("Invalid Format! Please use the format like: 'TER-LUA'")
      } while(entradaUsuario.split("-").length != 2)    

      origemDestino = entradaUsuario.split("-")
      melhorRota = universo.melhorTrajeto(List((0, List(origemDestino(0)))), origemDestino(1), Set())

      if(origemDestino(0) == origemDestino(1)) println("Origin and destiny are the same!") 
      else if(melhorRota._1 == 0) println("Impossible Route!")
      else {
        print("Best route: ")
        for(planeta <- melhorRota._2) print(planeta + " - ")
        println("Cost: " + melhorRota._1)
      }   
      
      println("Exit? y/n")
      entradaUsuario = readLine()  

    } 

  }

}