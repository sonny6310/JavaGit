
//class AA{
//	
//}
//class BB{
//	
//}
//class CC extends AA,BB{ // 또는 class CC extends AA extends BB 는 불가능. 상속가능 클래스 수는 최대 하나
//	
//}
//public class Ex03 extends CC{
//
//}

// 상속의 깊이를 더하는 것은 얼마든지 가능.
class AA{
	
}
class BB extends AA{
	
}
class CC extends BB{
	
}
public class Ex03 extends CC{

}

