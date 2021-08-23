// import org.scalatest.FunSuite
    
//  class UniversoTest extends FunSuite {
//    test("Universo.melhorTrajeto") {   
//      assert(1===1)  
//      //assert(Universo.melhorTrajeto(Nil, "TER", Set) ======== (0, 0))
//    }
//  }

class UniversoTest extends org.scalatest.funsuite.AnyFunSuite {
  test("UniversoTest.melhorTrajeto.OrigemNull") {    
    val universo = new Universo("exemplo.csv")    
    assert(universo.melhorTrajeto(Nil, "TER", Set()) === (0, List()))
  }

  test("UniversoTest.melhorTrajeto.DestinoInexistente") {    
    val universo = new Universo("exemplo.csv")    
    assert(universo.melhorTrajeto(List((0, List("TER"))), "ValorNaoExistenteArquivo", Set()) === (0, List()))
  }

  test("UniversoTest.melhorTrajeto.OrigemInexistente") {    
    val universo = new Universo("exemplo.csv")    
    assert(universo.melhorTrajeto(List((0, List("ValorNaoExistenteArquivo"))), "TER", Set()) === (0, List()))
  }

  test("UniversoTest.OrigemIgualDestino") {   
    val universo = new Universo("exemplo.csv")    
    assert(universo.melhorTrajeto(List((0, List("TER"))), "TER", Set()) === (0, List("TER")))    
  }

}