package video2;

public class uygulama {

    public static void main(String[] args) {

        Sinif nesne1 = new Sinif();
        Sinif nesne2 = new Sinif();
        Sinif nesne3 = new Sinif();

        nesne1.sayi = 1;
        nesne2.sayi = 2;
        nesne3.sayi = 3;

        nesne1.next = nesne2;
        nesne2.next = nesne3;
        nesne3.next = null;

        //Nesneleri Dolasma

        Sinif tmp = nesne1;

        while(tmp != null) {

            System.out.println(tmp.sayi);
            tmp = tmp.next;

        }


    }

}
