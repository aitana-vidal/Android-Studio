package com.example.mijardin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class

MainActivity extends AppCompatActivity {

    private static CardView cv1, cv2, cv3, cv4, cv5, cv6, cv7, cv8, cv9, cv10, cv11, cv12;
    private static ImageView i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, botonadd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cv1 = findViewById(R.id.card1);
        cv2 = findViewById(R.id.card2);
        cv3 = findViewById(R.id.card3);
        cv4 = findViewById(R.id.card4);
        cv5 = findViewById(R.id.card5);
        cv6 = findViewById(R.id.card6);
        cv7 = findViewById(R.id.card7);
        cv8 = findViewById(R.id.card8);
        cv9 = findViewById(R.id.card9);
        cv10 = findViewById(R.id.card10);
        cv11 = findViewById(R.id.card11);
        cv12 = findViewById(R.id.card12);
        botonadd = findViewById(R.id.botonadd);

        i1 = findViewById(R.id.image1);
        i2 = findViewById(R.id.image2);
        i3 = findViewById(R.id.image3);
        i4 = findViewById(R.id.image4);
        i5 = findViewById(R.id.image5);
        i6 = findViewById(R.id.image6);
        i7 = findViewById(R.id.image7);
        i8 = findViewById(R.id.image8);
        i9 = findViewById(R.id.image9);
        i10 = findViewById(R.id.image10);
        i11 = findViewById(R.id.image11);
        i12 = findViewById(R.id.image12);

        botonadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Add.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });

        cv1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this, Card.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    intent.putExtra("titulo", "Rosas azules");
                    intent.putExtra("texto", "La rosa azul es una variante relativamente reciente de esta especie, que surgió en los primeros años del s. XXI, gracias a la ingeniería genética. Las rosas azules son ejemplares muy difíciles de conseguir en su forma natural, lo que las convierte en elementos singulares, especiales y, en cierto modo, extraordinarios. Su desarrollo a través de la biotecnología genética fue producto del gran interés de los consumidores por poseer rosas azules.\n" +
                            "\n" +
                            "Para lograrlo fue necesario analizar y diferenciar los pigmentos que dan color a las flores. Entre ellos se encuentra la delfinidina, que es el que aporta la tonalidad azul a los vegetales. Su creación en laboratorio supuso uno de los hitos fundamentales en este tipo de investigación.\n" +
                            "\n" +
                            "La primera iniciativa en la búsqueda de la rosa azul se llevó a cabo en 1990 por parte de la empresa australiana Florigene, que contaba con el auspicio económico de la empresa de bebidas japonesa Suntory. Consiguieron aislar el gen azul de las flores, el denominado “blue gene”, que introdujeron en primer lugar en los claveles, obteniendo de esta forma las primeras flores con esa pigmentación.\n" +
                            "\n" +
                            "La empresa japonesa continuó con sus investigaciones y en 2004 dio a conocer la primera rosa modificada genéticamente con el blue gene. Ese fue el origen de las rosas azules. Posteriormente, en el año 2009 se presentó en la Exposición Internacional de Tokio la rosa azul transgénica, saliendo ese mismo año a la venta. En la actualidad, la empresa cuenta con la propiedad de venta del producto para todo el mundo.\n" +
                            "\n" +
                            "El siguiente paso fue crear rosas preservadas de color azul, algo que se consiguió al poco tiempo de producirse la comercialización de la variante transgénica. Una vez que los ejemplares tratados genéticamente fueron implantados en el mercado, fue sencillo someterlas a un tratamiento químico para preservar sus características y su precioso color.");
                    intent.putExtra("imagen", R.drawable.rosaazul);
                    startActivity(intent);
                }
            });
        cv2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this, Card.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    intent.putExtra("titulo", "Flor de loto");
                    intent.putExtra("texto", "Es una planta herbácea acuática.\n" +
                            "\n" +
                            "Las hojas son flotantes o emergentes, peltadas, glaucas, de limbo orbicular, de 25-30-100 cm de diámetro, glabro, de borde frecuentemente ondulado, hidrófobo; pecíolo normalmente con acúleos, de 1 a 2 m o más de largo, fistuloso. Arrancan desde el rizoma, que puede alcanzar 20 m de largo, es grueso, ramificados, con numerosos catáfilos, profundamente enraizado en el fondo.\n" +
                            "\n" +
                            "Flores de 16-23 cm de diámetro, rosa vivo a pálido o blancas, olorosas, con pétalos cóncavos, oblongo-elípticos a obovados, 5-10 × 3-5 cm; anteras de 1-2 cm de largo; pedúnculos normalmente con acúleos, sobrepasando la altura de las hojas.\n" +
                            "Los frutos complejos están formados por un receptáculo elipsoidal, de 5-10 cm de diámetro, de lados rugosos a débilmente estriados, con el ápice truncado y plano, y las núculas insertas en fosetas en él. Núculas de 10-20 × 7-13 mm, ovoides, usualmente más de 1,5. Florece al final de primavera y en verano. ");
                    intent.putExtra("imagen", R.drawable.flordeloto);
                    startActivity(intent);
                }
            });
        cv3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this, Card.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    intent.putExtra("titulo", "Hortensia");
                    intent.putExtra("texto", "Las hortensias nacen desde el inicio de la primavera hasta finales del otoño; éstas se encuentran agrupadas en ramos en el extremo de los tallos. Cada flor individual de hortensia es relativamente pequeña; sin embargo, el despliegue de color está acrecentado por un círculo de brácteas modificadas alrededor de cada flor.\n" +
                            "\n" +
                            "Sus flores pueden ser rosas, blancas, o azules, dependiendo en parte del pH del suelo. En suelos relativamente ácidos, con pH entre 4,5 y 5, las flores se hacen azules; en suelos más alcalinos, con pH entre 6 y 6,5, las flores adquieren un color rosa; y en suelos alcalinos con pH alrededor de 8, las flores crecen blancas. ");
                    intent.putExtra("imagen", R.drawable.hortensia_rose);
                    startActivity(intent);
                }
            });
        cv4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this, Card.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    intent.putExtra("titulo", "Flor de Pascua");
                    intent.putExtra("texto", "Es un pequeño árbol o arbusto caducifolio poco ramificado, que puede alcanzar hasta 4 m de altura. Hojas lanceoladas u ovadas-elípticas, pueden ser enteras o dentadas. Tallos gruesos y lisos. Las hojas, de márgenes lisos o dentados, son simples, dispuestas de manera alterna, de forma ovada a elíptica, venosas, sinuosas y con dos senos laterales profundos limitados por crestas subagudas. Las inflorescencias en el ápice de los tallos están formadas por una única flor femenina sin pétalos ni sépalos, rodeada por flores masculinas individuales contenidas en una estructura denominada ciato exclusiva del género Euphorbia. De cada ciato surge una glándula bilabiada de color amarillo. Estas inflorescencias están rodeadas por largas brácteas de color rojo que conforman la parte superior de la planta con la apariencia de llamativas flores. Se han creado cultivares con brácteas de diferentes colores.8\u200B 9\u200B\n" +
                            "\n" +
                            "Florece en invierno. En el hemisferio norte florece de noviembre a febrero y es esencial que la planta no reciba luz durante 12 horas, aproximadamente desde octubre hasta Navidad para que florezca. ");
                    intent.putExtra("imagen", R.drawable.flordepascua);
                    startActivity(intent);
                }
            });
        cv5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this, Card.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    intent.putExtra("titulo", "Amapola");
                    intent.putExtra("texto", " Es una planta de ciclo anual que puede alcanzar más de 50 cm de altura. Posee tallos erectos y poco ramificados con finos pelillos. Las hojas, que nacen alternas a lo largo del tallo, sin peciolo, son pinnadas y muy dentadas en los márgenes con una única nervadura central. Las flores, de color escarlata intenso, acampanadas y casi esféricas, poseen cuatro finos pétalos y dos sépalos vellosos. Los pétalos son muy delicados y se marchitan rápidamente, por lo que las flores no puede usarse en adornos florales. Los estambres, de color negro, forman un racimo anillado alrededor del gineceo, lo que le da el aspecto de botón negro. El fruto es una cápsula unilocular con falsos tabiques, verde pálido, de forma ovalada/subglobosa, truncada por una especie de tapa en la parte superior (disco) con 8-18 radios y con numerosas semillas inframilimétricas, que escapan a través de poros debajo del disco superior (dehiscencia porícida). Dichas diminutas semillas son, como en todas las especies del género, de forma arriñonada, alveoladas con retículo poligonal y de color pardo. Florecen de principio a final de la primavera. No resisten los climas cálidos ni la humedad.[cita requerida]\n" +
                            "Detalle de los aparatos reproductores\n" +
                            "\n" +
                            "La amapola se ha asociado a la agricultura desde épocas antiguas. Su ciclo de vida se adapta a la mayoría de los cultivos de cereales, florecen y granan antes de la recolección de las cosechas. Aunque se la considera una mala hierba, es fácil de combatir con los habituales métodos de control de plagas.");
                    intent.putExtra("imagen", R.drawable.amapola);
                    startActivity(intent);
                }
            });
        cv6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this, Card.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    intent.putExtra("titulo", "Azahar");
                    intent.putExtra("texto", "Azahar o flor de azahar es el nombre de las flores blancas del naranjo, del limonero y del cidro.1\u200B El nombre procede del árabe hispánico az-zahár, y este, del árabe clásico az-zahr (que significa 'flor'). El nombre se asocia popularmente a la flor de naranjo, la más apreciada de todas por su belleza, aroma y propiedades, las cuales son tradicionalmente consideradas terapéuticas.\n" +
                            "\n" +
                            "Es ingrediente esencial en varias infusiones por sus propiedades sedantes.2\u200B De la flor de azahar se destila también aceite esencial, aceite de flores de naranjo o neroli.\n" +
                            "\n" +
                            "Este tipo de flor puede observarse durante la época primaveral no solo en los campos de cultivo de las citadas especies, sino también en las calles y plazas de muchas ciudades españolas (especialmente Valencia, Murcia, Málaga, Córdoba y Sevilla), donde se utiliza como árbol ornamental y su agradable fragancia invade el ambiente urbano. En Andalucía y la Región de Murcia se suele relacionar además con la Semana Santa, ya que suele brotar en los días que anteceden a la misma. Mientras que en la Comunitat Valencia se la asocia a la flor nacional del territorio. ");
                    intent.putExtra("imagen", R.drawable.azahar);
                    startActivity(intent);
                }
            });
        cv7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this, Card.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    intent.putExtra("titulo", "Lirio");
                    intent.putExtra("texto", "Los lirios son herbáceas perennes de tallos erectos con numerosas hojas alternas, lineares a lanceoladas. Crecen a partir de bulbos formados por escamas carnosas sin túnica.\n" +
                            "En algunas especies norteamericanas la base del bulbo desarrolla rizomas sobre los que se encuentran numerosos bulbillos pequeños. Otras desarrollan estolones. La mayoría de los bulbos están profundamente enterrados, sin embargo unos cuantos se forman cerca de la superficie del suelo.\n" +
                            "Hay especies que desarrollan raíces adventicias en el tallo, con ellas, el bulbo crece de forma natural a cierta profundidad y cada año el nuevo tallo, a medida que emerge del suelo, emite raíces adventicias por encima del bulbo. Estas son adicionales a las raíces basales.\n" +
                            "\n" +
                            "La mayoría de especies pierden la parte aérea en invierno, excepto unas cuantas (como Lilium candidum, Lilium catesbaei) que mantienen una roseta de hojas basales durante el periodo de inactividad invernal.\n" +
                            "La inflorescencia es terminal, en racimo o umbela, con una sola flor o hasta 25. Las flores en las especies pueden ser colgantes, erectas, ascendentes u horizontales; con perianto en forma de campana o embudo recurvados o reflejos. Tienen 6 tépalos en una variedad de colores que abarca el blanco, amarillo, naranja, rosa o rojo, con manchas o puntos magenta o marrón. Los estambres son 6. El fruto es una cápsula con tres valvas, más o menos oblonga, de color verde tornándose marrón al madurar. Puede contener más de trescientas semillas.");
                    intent.putExtra("imagen", R.drawable.lirio);
                    startActivity(intent);
                }
            });
        cv8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this, Card.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    intent.putExtra("titulo", "Tulipán");
                    intent.putExtra("texto", "Son plantas herbáceas y bulbosas. Los bulbos son truncados basalmente y elongados hacia el ápice, cubiertos por una túnica usualmente pilosa por dentro. El tallo es simple (ocasionalmente ramificado) y subterráneo en su porción basal. Las hojas son basales y caulinares, espaciadas o más o menos arrosetadas, lineales, aovadas o lanceoladas.\n" +
                            "\n" +
                            "Las flores son actinomorfas y hermafroditas, erguidas o, más raramente, péndulas, y se hallan dispuestas en número de 1 a 3 en la extremidad de los tallos floríferos. El perigonio es anchamente infundibuliforme o acampanado, compuesto de tépalos libres, subiguales, generalmente anchos e imbricados, coloreados, frecuentemente con un diminuto mechón de pelos blancos en el ápice. El androceo está formado por seis estambres, inclusos, con los filamentos aplanados y las anteras oblongas. El ovario es súpero, trilocular, pluriovulado. El estilo es columnar o muy corto, el estigma es trilobado. El fruto es una cápsula loculicida, pluriseminada. Las semillas suelen ser planas, subdeltoideas.");
                    intent.putExtra("imagen", R.drawable.tulipanes);
                    startActivity(intent);
                }
            });
        cv9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this, Card.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    intent.putExtra("titulo", "Cosmos");
                    intent.putExtra("texto", "Planta de tallos erectos cuya altura varía entre los 60 y 120 cm. Las hojas bipinnadas están divididas en segmentos filiformes finamente cortados. Las diferentes variedades tienen flores en tonos rosa, púrpura y blanco.\n" +
                            "Algunas con dos de estos colores en la misma flor. Se considera una planta anual semirresistente, aunque pueden aparecer plantas durante varios años debido a la autosiembra (las semillas germinan al caer sobre la tierra). ");
                    intent.putExtra("imagen", R.drawable.flordecosmo);
                    startActivity(intent);
                }
            });
        cv10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this, Card.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    intent.putExtra("titulo", "Girasol");
                    intent.putExtra("texto", "Los girasoles son plantas anuales (como lo indica su nombre específico latín: annuus) que pueden medir tres metros de alto. Los tallos son generalmente erectos e hispidos. La mayoría de las hojas son caulinares, alternas, pecioladas, con base cordiforme y bordes aserrados. La cara inferior es usualmente más o menos hispida, a veces glandulosa y la superior glabra. El involucro es hemiesférico o anchado y mide 15-40 mm y hasta más de 20 cm. Las brácteas involúcrales llamadas filiaros se encuentran en número de 20-30, y hasta más de 100, ovaladas a lanceoladas —brutalmente estrechadas en el ápice— nerviadas longitudinalmente, con el borde generalmente hispido o hirsuto, al igual que sus caras exteriores, raramente son glabras. Receptáculo con escamas centimétricas tridentadas, con el diente mediano más grande y la punta hirsuta. Las lígulas, en número de 15-30, y hasta 100, de color amarillo a anaranjado hasta rojas, miden 2,5-5 cm; los flósculos, de 150 hasta 1000, del mismo color con los estambres pardos-rojizos. Los frutos son aquenios ovalados, algo truncados en la base, de 3-15 mm de largo, glabros o casi, estriados por finísimos surcos verticales, de color oscuro, generalmente casi negras —aunque pueden ser también blanquecinas, rojizas, de color miel o bien moteados o con bandas longitudinales más claras—. El vilano consiste en dos escamas lanceoladas de 2-3,5 mm acompañadas, o no, de hasta cuatro escamitas obtusas de 0,5-1 mm, todas tempranamente caedizas. (como lo indica su nombre específico latín: annuus) ");
                    intent.putExtra("imagen", R.drawable.girasol);
                    startActivity(intent);
                }
            });
        cv11.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this, Card.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    intent.putExtra("titulo", "Clavel");
                    intent.putExtra("texto", "El clavel o clavelina (Dianthus caryophyllus) es una planta herbácea perteneciente a la familia de las Caryophyllaceae, es considerada como flor del agua, difundida en las regiones mediterráneas. Es espontánea en la flora de la península ibérica. En su forma típica es una planta cespitosa, con numerosos vástagos de hasta 1 m de altura. Sus hojas son lineales, angostas, opuestas y envainadoras, más anchas las basales que las caulinares. Cada tallo forma una flor terminal. Sus flores son vistosas, pedunculadas en panícula o cima laxa, a veces solitarias, de bordes más o menos dentados.\n" +
                            "\n" +
                            "La planta perenne de base leñosa alcanza una altura entre los 45 y los 60 cm. La floración se produce durante casi todo el año. Normalmente son flores de fuerte fragancia. Es la flor nacional de España. ");
                    intent.putExtra("imagen", R.drawable.clavel);
                    startActivity(intent);
                }
            });
        cv12.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this, Card.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    intent.putExtra("titulo", "Margarita");
                    intent.putExtra("texto", "Planta herbácea perenne, ocasionalmente con pequeños rizomas, glabrescentes o laxamente pubescentes y hojas obovado-espatuladas, crenadas o dentada-redondeadas de 10-60 por 4-20 mm. Escapos sin hojas de hasta 20 cm de altura.1\u200B Las brácteas involucrales tienen pelos pluricelulares más o menos abundantes en el dorso. Las flores hemiliguladas de 5,5-8,5 mm, sobrepasan el involucro en 2-5 mm, y tienen un tubo de 0,3-0,8 mm; son blancas, a veces teñidas de púrpura; los flósculos, amarillos, tienen 1,5-2 mm. El fruto es un aquenio de 1-1,5 por 0,5-1 mm, obovoideo, comprimido, algo peludo, con borde periférico engrosado; vilano ausente.\n" +
                            "Florece y fructifica de octubre a junio.");
                    intent.putExtra("imagen", R.drawable.margarita);
                    startActivity(intent);
                }
            });


        cv1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                cv1.setVisibility(View.GONE);
                return true;
            }

        });
        cv2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                cv2.setVisibility(View.GONE);
                return true;
            }
        });
        cv3.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                cv3.setVisibility(View.GONE);
                return true;
            }
        });
        cv4.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                cv4.setVisibility(View.GONE);
                return true;
            }
        });
        cv5.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                cv5.setVisibility(View.GONE);
                return true;
            }
        });
        cv6.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                cv6.setVisibility(View.GONE);
                return true;
            }
        });
        cv7.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                cv7.setVisibility(View.GONE);
                return true;
            }
        });
        cv8.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                cv8.setVisibility(View.GONE);
                return true;
            }
        });
        cv9.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                cv9.setVisibility(View.GONE);
                return true;
            }
        });
        cv10.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                cv10.setVisibility(View.GONE);
                return true;
            }
        });
        cv11.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                cv11.setVisibility(View.GONE);
                return true;
            }
        });
        cv12.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                cv12.setVisibility(View.GONE);
                return true;
            }
        });


    }







}