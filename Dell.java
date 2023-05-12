//bibliotecas importadas
import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;


/** Autor: Andrei Cunha Boeck
 * Programa desenvolvido para o processo seletivo IT Dell Academy
 * Data de inicio: 22 de marco de 2023
 * Data de conclusão: 28 de marco de 2023 
 */


public class Dell {
    public static void main(String[] args) throws IOException, InterruptedException  {
        //Optei em declarar todos os valores dentro do codigo para evitar a necessidade de sempre conter o arquivo .csv com ele
        HashMap<String, Integer> cidades = new HashMap<String, Integer>();
        HashMap<Integer, int[]> partida = new HashMap<Integer, int[]>();
        ArrayList<String> nomes = new ArrayList<String>();
        ArrayList<Integer> paradas = new ArrayList<Integer>();
        ArrayList<Integer> distancia = new ArrayList<Integer>();
        ArrayList<Integer> distanciatotal = new ArrayList<Integer>();
        ArrayList<Integer> quantidade = new ArrayList<Integer>();
        ArrayList<Integer> unidades = new ArrayList<Integer>();
        ArrayList<String> nome = new ArrayList<String>();
        ArrayList<Double> peso = new ArrayList<Double>();
        ArrayList<Double> customedio = new ArrayList<Double>(); 
        ArrayList<ArrayList<String>> armazenamentoc = new ArrayList<ArrayList<String>>();
        ArrayList<ArrayList<Integer>> armazenamentod = new ArrayList<ArrayList<Integer>>();
        ArrayList<Object> caminhaopequeno = new ArrayList<Object>();
        ArrayList<Object> caminhaomedio = new ArrayList<Object>();
        ArrayList<Object> caminhaogrande = new ArrayList<Object>();
        int caso=0;
        int[] Aracaju = {0, 2079, 1578, 1650, 2764, 2773, 2595, 2892, 1183, 1849, 611, 294, 5215, 788, 3296, 4229, 501, 4763,1855,356,1578,2188,1142,1408};
        int[] Belem = {2079,0,2824,2120,2942,2941,3193,3500,1610,2017,2161,2173,5298,2108,3852,4397,2074,4931,3250,2100,806,2933,947,3108};
        int[] BeloHorizonte = {1578,2824,0,716,1453,1594,1004,1301,2528,906,2171,1854,3951,2348,1712,3050,2061,3584,434,1372,2738,586,2302,524};
        int[] Brasilia = {1650,2140,741,0,1134,1133,1366,1673,2200,209,2245,1930,3490,2422,2027,2589,2135,3123,1148,1446,2157,1015,1789,1239};
        int[] CampoGrande = {2764,2942,1453,1134,0,694,991,1298,3407,935,3357,3040,3051,3534,1518,2150,3247,2684,1444,2568,2979,1014,2911,1892};
        int[] Cuiaba = {2773,2941,1594,1133,694,0,1679,1986,3406,934,3366,3049,2357,3543,2206,1456,3255,1990,2017,2566,2978,1614,2910,2119};
        int[] Curitiba = {2595,3193,1004,1366,991,1679,0,300,3541,1186,3188,2871,4036,3365,711,3135,3078,3669,852,2385,3230,408,3143,1300};
        int[] Florianopolis = {2892,3500,1301,1673,1298,1986,300,0,3838,1493,3485,3168,4443,3662,476,3442,3375,3976,1144,2682,3537,705,3450,1597};
        int[] Fortaleza = {1183,1611,2528,2208,3407,3406,3541,3838,0,2482,688,1075,5763,537,4242,4862,800,5396,2805,1389,1070,3127,634,2397};
        int[] Goiania = {1849,2017,906,209,935,934,1186,1493,2482,0,2442,2125,3291,2618,1847,2390,2332,2924,1338,1643,2054,926,1986,1428};
        int[] JoaoPessoa = {611,2161,2171,2245,3357,3366,3188,3485,688,2442,0,395,5808,185,3889,4822,120,5356,2448,949,1660,2770,1224,2001};
        int[] Maceio = {294,2173,1854,1928,3040,3049,2871,3168,1075,2105,395,0,5491,572,3572,4505,285,5039,2131,632,1672,2453,1236,1684};
        int[] Manaus = {5215,5298,3951,3490,3051,2357,4036,4343,5763,3291,5808,5491,0,5985,4563,901,5698,1445,4374,5009,5335,3971,5267,4476};
        int[] Natal = {788,2108,2348,2422,3537,3543,3365,3662,537,2619,185,572,5985,0,4066,4998,297,5533,2625,1126,1607,2947,1171,2178};
        int[] PortoAlegre = {3296,3854,1712,2027,1518,2206,711,476,4242,1847,3889,3572,4563,4066,0,3662,3779,4196,1553,3090,3891,1109,3804,2001};
        int[] PortoVelho = {4229,4397,3050,2589,2150,1456,3135,3442,4865,2390,4822,4505,901,4999,3662,0,4712,544,3473,4023,4434,3070,4366,3575};
        int[] Recife = {501,2074,2061,2135,3247,3256,3078,3375,800,2332,120,285,5698,297,3779,4712,0,5243,2338,839,1573,2660,1137,1891};
        int[] RioBranco = {4763,4931,3584,3123,2684,1990,3669,3976,5396,2924,5356,5039,1445,5533,4196,544,5243,0,4007,4457,4968,3604,4900,4109};
        int[] RioDeJaneiro = {1855,3250,434,1148,1444,2017,852,1144,2805,1338,2448,2131,4374,2625,1553,3473,2338,4007,0,1649,3015,429,2579,521};
        int[] Salvador = {356,2100,1372,1446,2568,2567,2385,2682,1389,1643,949,632,5009,1126,3090,4023,839,4457,1649,0,1599,1962,1163,1202};
        int[] SaoLuis = {1578,806,2738,2157,2979,2978,3230,3537,1070,2054,1660,1672,5335,1607,3891,4434,1573,4968,3015,1599,0,2970,446,2607};
        int[] SaoPaulo = {2188,2933,586,1015,1014,1614,408,705,3127,926,2770,2453,3971,2947,1109,3070,2660,3604,429,1962,2970,0,2792,882};
        int[] Teresina = {1142,947,2302,1789,2911,2910,3143,3450,634,1986,1224,1236,5267,1171,3804,4366,1137,4900,2579,1163,446,2792,0,2171};
        int[] Vitoria = {1408,3108,524,1238,1892,2119,1300,1597,2397,1428,2001,1684,4476,2178,2001,3575,1891,4109,521,1202,2607,882,2171,0};
        //Em consequencia da minha escolha precisei atribuir um valor a cada cidade, mas nada que umas linhas de codigos a mais não resolvam
        cidades.put("Aracaju", 0);
        partida.put(0, Aracaju);
        cidades.put("Belem", 1);
        partida.put(1, Belem);
        cidades.put("BeloHorizonte", 2);
        partida.put(2, BeloHorizonte);
        cidades.put("Brasilia", 3);
        partida.put(3, Brasilia);
        cidades.put("CampoGrande", 4);
        partida.put(4, CampoGrande);
        cidades.put("Cuiaba", 5);
        partida.put(5, Cuiaba);
        cidades.put("Curitiba", 6);
        partida.put(6, Curitiba);
        cidades.put("Florianopolis", 7);
        partida.put(7, Florianopolis);
        cidades.put("Fortaleza", 8);
        partida.put(8, Fortaleza);
        cidades.put("Goiania", 9);
        partida.put(9, Goiania);
        cidades.put("JoaoPessoa", 10);
        partida.put(10, JoaoPessoa);
        cidades.put("Maceio", 11);
        partida.put(11, Maceio);
        cidades.put("Manaus", 12);
        partida.put(12, Manaus);
        cidades.put("Natal", 13);
        partida.put(13, Natal);
        cidades.put("PortoAlegre", 14);
        partida.put(14, PortoAlegre);
        cidades.put("PortoVelho", 15);
        partida.put(15, PortoVelho);
        cidades.put("Recife", 16);
        partida.put(16, Recife);
        cidades.put("RioBranco", 17);
        partida.put(17, RioBranco);
        cidades.put("RioDeJaneiro", 18);
        partida.put(18, RioDeJaneiro);
        cidades.put("Salvador", 19);
        partida.put(19, Salvador);
        cidades.put("SaoLuis", 20);
        partida.put(20, SaoLuis);
        cidades.put("SaoPaulo", 21);
        partida.put(21, SaoPaulo);
        cidades.put("Teresina", 22);
        partida.put(22, Teresina);
        cidades.put("Vitoria", 23);
        partida.put(23, Vitoria);
        //O usuario vai ser convidado a fazer a escolha de qual metodo ele deseja consultar
        Scanner in = new Scanner(System.in);
        while(true){
            String os = System.getProperty("os.name").toLowerCase();
            System.out.printf("\nEscolha a opção que deseja consultar:\n1- [Consultar trechos x modalidade]\n2- [Cadastrar Transporte]\n3- [Dados estatísticos]\nQuando desejar sair aperte Ctrl + C\n");
            int escolha = in.nextInt();
            if(os.contains("win")){
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            }
            else{
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
            if(escolha==1){
                // Se o usuario optar pela primeira opção ele ira fazer uma simples consulta do preço em relação a distancia. Aqui ele pode selecionar a modalidade e duas distancias
                System.out.printf("Cidades disponiveis:\n" + "Aracaju, Belem, BeloHorizonte, Brasilia, CampoGrande, Cuiaba, Curitiba, Florianopolis, Fortaleza, Goiania, JoaoPessoa,\n Maceio, Manaus, Natal, PortoAlegre, PortoVelho, Recife, RioBranco, Rio De Janeiro, Salvador, SaoLuis, SaoPaulo, Teresina, Vitoria\n");
                String cidade = in.next();
                System.out.println("Segunda cidade: ");
                String destino = in.next();
                if(os.contains("win")){
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    }
                    else{
                        new ProcessBuilder("clear").inheritIO().start().waitFor();
                    }
                //caso o usuario digite um cidade invalida ele sera notificado pelo programa
                if(cidades.get(cidade) == null || cidades.get(destino) == null){System.out.println("\nCidade fora da area de cobertura");}
                else{
                    System.out.println("\nQual modelo de caminhão deseja escolher?\n1- Caminhão Pequeno(Até uma tonelada)\n2- Caminhão médio(Até quatro toneladas)\n3- Caminhão Grande(Até dez toneladas)");
                    int caminhao = in.nextInt();
                    if(os.contains("win")){
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                        }
                        else{
                            new ProcessBuilder("clear").inheritIO().start().waitFor();
                        }
                    if(caminhao == 1){
                        System.out.println("Distancia: " + partida.get(cidades.get(cidade))[cidades.get(destino)] + "Km");
                        System.out.printf("Preço: R$%.2f\n", (partida.get(cidades.get(cidade))[cidades.get(destino)]*4.87));
                    }
                    else if(caminhao == 2){
                        System.out.println("Distancia: " + partida.get(cidades.get(cidade))[cidades.get(destino)] + "Km");
                        System.out.printf("Preço: R$%.2f\n", (partida.get(cidades.get(cidade))[cidades.get(destino)]*11.92));
                    }
                    else if(caminhao == 3){
                        System.out.println("Distancia: " + partida.get(cidades.get(cidade))[cidades.get(destino)] + "Km");
                        System.out.printf("Preço: R$%.2f\n", (partida.get(cidades.get(cidade))[cidades.get(destino)]*27.44));
                    }
                }
            }
            //no caso 2 o usuario tem total liberdade para escolher quantas paradas desejar e quantos itens ira transportar, cabera ao programa decidir a melhor distribuição entre os caminhões
            else if(escolha==2){
                int menor, cidade;
                double total=0;
                nomes.clear();
                distanciatotal.clear();
                nome.clear();
                quantidade.clear();
                System.out.printf("Cidades disponiveis:\n" + "Aracaju, Belem, BeloHorizonte, Brasilia, CampoGrande, Cuiaba, Curitiba, Florianopolis, Fortaleza, Goiania, JoaoPessoa,\n Maceio, Manaus, Natal, PortoAlegre, PortoVelho, Recife, RioBranco, Rio De Janeiro, Salvador, SaoLuis, SaoPaulo, Teresina, Vitoria\n");
                System.out.printf("Cidade de origem:");
                String cidade1 = in.next();
                if(os.contains("win")){
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    }
                    else{
                        new ProcessBuilder("clear").inheritIO().start().waitFor();
                    }
                System.out.println("Declare suas paradas,quando declarar todas digite sair");
                //O usuario esta preso em um loop, so consiguira sair quando digitar sair
                while (true)
                {
                    String imput = in.next();
                    if(imput.compareTo("sair")==0){break;}
                    paradas.add(cidades.get(imput));
                    nomes.add(imput);
                    imput = "";
                }
                if(os.contains("win")){
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    }
                    else{
                        new ProcessBuilder("clear").inheritIO().start().waitFor();
                    }
                cidade = cidades.get(cidade1);
                //nesta etapa o programa ve a distancia mais proxima do ponto de origem e em seguida armazena sua distancia, apos isso ele substitui a cidade de origem pela parada e repete o processo
                while(true)
                {
                    for(int i=0; i<paradas.size(); i++)
                    {
                        distancia.add(partida.get(cidade)[paradas.get(i)]);
                    }
                    menor = Collections.min(distancia);
                    distanciatotal.add(menor);
                    cidade = paradas.get(distancia.indexOf(menor));
                    paradas.remove(distancia.indexOf(menor));
                    distancia.clear();
                    if(paradas.size()==0){break;}
                }
                if(os.contains("win")){
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    }
                    else{
                        new ProcessBuilder("clear").inheritIO().start().waitFor();
                    }
                //aqui ele pergunta os itens e seus respectivos pesos, calcula a carga e ja diz quais caminhoes serao necessarios
                while(true)
                {
                    System.out.println("Qual item voce ira levar?");
                    String x = in.next();
                    nome.add(x);
                    System.out.println("Quantos desse item ira levar?");
                    int y = in.nextInt();
                    quantidade.add(y);
                    System.out.println("Qual o peso desse item?");
                    double z = in.nextDouble();
                    peso.add(z);
                    unidades.add(y);
                    System.out.println("Mais algum item?(digite SIM ou NAO)");
                    String para = in.next();
                    if(para.compareTo("NAO")==0){break;}
                }
                if(os.contains("win")){
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    }
                    else{
                        new ProcessBuilder("clear").inheritIO().start().waitFor();
                    }
                double ct=0;
                for(int i = 0; i<peso.size(); i++){ct += peso.get(i)*quantidade.get(i);}
                int caminhaog=0,caminhaom=0,caminhaop=0;
                double custo=0;
                if(ct>8000){
                    caminhaog=(int)ct/10000;
                    ct%=10000;                    
                }
                if(ct<=8000 && ct>2000){
                    caminhaom=(int)ct/4000;
                    ct%=4000;
                }
                if(ct>=0 && ct<=2000){
                    caminhaop=(int)ct/1000;
                    ct%=1000;
                }
                if(ct>0){caminhaop++;}
                //quando ha um tipo de veiculo que acaba saindo mais caro que pegar um outro maior ele faz isso por meio de comparacao
                while(caminhaop>=3){caminhaop-=3;caminhaom++;}
                while(caminhaom>=3){caminhaom-=3;caminhaog++;}
                System.out.printf(caminhaog + " caminhões grandes\n" + caminhaom + " caminhões medios\n" + caminhaop + "caminhões pequenos\n");
                int dist;
                for(int i=0;i<distanciatotal.size(); i++){
                    System.out.printf("Trecho %d\n",i);
                    System.out.println(distanciatotal.get(i));
                    dist = distanciatotal.get(i);
                    custo = dist*caminhaop*4.87+dist*11.92*caminhaom+dist*caminhaog*27.44;
                    System.out.println("preço por trecho: "+custo);
                    total+=custo;
                }
                peso.clear();
                //esta etapa ja e uma preparacao para opcao numero 3 onde todos os dados coletados aqui sao consultados
                armazenamentoc.add((ArrayList<String>)nomes.clone());
                armazenamentod.add((ArrayList<Integer>) distanciatotal.clone());
                caminhaopequeno.add(caminhaop);
                caminhaomedio.add(caminhaom);
                caminhaogrande.add(caminhaog);
                customedio.add(total);
                caso++;
            }
            else if(escolha==3){
                double price=0,modal=0;
                int unidade=0, itens=0;
                //nessa estapa nao teve muito segredo, apenas alguns prints e outras contas matematicas
                for(int i=0; i<caso; i++){
                    System.out.printf("Custo total da consulta numero %d\n%.2f\n",i+1 , customedio.get(i));
                    System.out.printf("Custo medio por trecho:\n");
                    for(int n=0;n<distanciatotal.size(); n++){
                        System.out.println(armazenamentoc.get(i).get(n));
                        System.out.printf("R$ %.2f\n", customedio.get(i)/distanciatotal.get(n));
                    }
                    System.out.printf("Custo medio por item:\n");
                    for(int n=0;n<quantidade.size(); n++){
                        System.out.println(nome.get(n));
                        System.out.printf("R$ %.2f\n", customedio.get(i)/quantidade.get(n));
                    }
                }
                System.out.println("Custo total por trecho:");
                for(int i=0; i<customedio.size(); i++)
                {
                    price += customedio.get(i)/distanciatotal.get(i);
                }
                System.out.println(price);
                System.out.println("Custo total por modalidade");
                for(int i=0; i<customedio.size(); i++)
                {
                    modal += customedio.get(i)/quantidade.get(i);
                }
                System.out.println(modal);
                System.out.print("Caminhoes alocados: ");
                for(int i =0; i<caminhaopequeno.size(); i++)
                {
                    unidade++;
                }
                for(int i =0; i<caminhaomedio.size(); i++)
                {
                    unidade++;
                }
                for(int i =0; i<caminhaogrande.size(); i++)
                {
                    unidade++;
                }
                System.out.println(unidade);
                for(int i = 0;i<unidades.size();i++){
                    itens += unidades.get(i);
                }
                System.out.println(itens);
            }
            else if(escolha==4){break;}
            else{
                System.out.println("Opção invalida");
            }
        }
        in.close();
    }
}
