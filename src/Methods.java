
public class Methods {
    void method1(){
        Gen<Integer> iOb;
        iOb = new Gen<Integer> (10) ;
        iOb.showType();
        int v = iOb . getob();
        System.out.println ( "Знaчeниe : "+ v ) ;
        System.out.println ();
        Gen<String> strOb = new Gen<String> ( "Тест 1" ) ;
        strOb.showType();
        String str = strOb.getob();
        System.out.println( "Знaчeниe : "+ str) ;
    }

    void method2(){
        NonGen iob;
        iob = new NonGen ( 11 ) ;
        iob.showТype();
        int v = ( Integer) iob.getob() ;
        System.out.println("Знaчeниe: " + v ) ;
        System.out.println();
        NonGen strOb = new NonGen ("Tecт 2" );
        strOb.showТype();
        String str = (String) strOb.getob() ;
        System.out.println ( "Знaчeниe: "+ str) ;

    }

    void method3(){
        TwoGen< Integer, String> tgObj = new TwoGen< Integer, String> (42, "Обобщения") ;
        tgObj.showТypes(); ;
        int v = tgObj.getob1();
        System.out.println( "Знaчeниe: "+ v) ;
        String str = tgObj.getob2();
        System. out . println ( "Знaчeниe: " + str ) ;
    }
}
