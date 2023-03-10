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
                    intent.putExtra("texto", "La rosa azul es una variante relativamente reciente de esta especie, que surgi?? en los primeros a??os del s. XXI, gracias a la ingenier??a gen??tica. Las rosas azules son ejemplares muy dif??ciles de conseguir en su forma natural, lo que las convierte en elementos singulares, especiales y, en cierto modo, extraordinarios. Su desarrollo a trav??s de la biotecnolog??a gen??tica fue producto del gran inter??s de los consumidores por poseer rosas azules.\n" +
                            "\n" +
                            "Para lograrlo fue necesario analizar y diferenciar los pigmentos que dan color a las flores. Entre ellos se encuentra la delfinidina, que es el que aporta la tonalidad azul a los vegetales. Su creaci??n en laboratorio supuso uno de los hitos fundamentales en este tipo de investigaci??n.\n" +
                            "\n" +
                            "La primera iniciativa en la b??squeda de la rosa azul se llev?? a cabo en 1990 por parte de la empresa australiana Florigene, que contaba con el auspicio econ??mico de la empresa de bebidas japonesa Suntory. Consiguieron aislar el gen azul de las flores, el denominado ???blue gene???, que introdujeron en primer lugar en los claveles, obteniendo de esta forma las primeras flores con esa pigmentaci??n.\n" +
                            "\n" +
                            "La empresa japonesa continu?? con sus investigaciones y en 2004 dio a conocer la primera rosa modificada gen??ticamente con el blue gene. Ese fue el origen de las rosas azules. Posteriormente, en el a??o 2009 se present?? en la Exposici??n Internacional de Tokio la rosa azul transg??nica, saliendo ese mismo a??o a la venta. En la actualidad, la empresa cuenta con la propiedad de venta del producto para todo el mundo.\n" +
                            "\n" +
                            "El siguiente paso fue crear rosas preservadas de color azul, algo que se consigui?? al poco tiempo de producirse la comercializaci??n de la variante transg??nica. Una vez que los ejemplares tratados gen??ticamente fueron implantados en el mercado, fue sencillo someterlas a un tratamiento qu??mico para preservar sus caracter??sticas y su precioso color.");
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
                    intent.putExtra("texto", "Es una planta herb??cea acu??tica.\n" +
                            "\n" +
                            "Las hojas son flotantes o emergentes, peltadas, glaucas, de limbo orbicular, de 25-30-100??cm de di??metro, glabro, de borde frecuentemente ondulado, hidr??fobo; pec??olo normalmente con ac??leos, de 1 a 2??m o m??s de largo, fistuloso. Arrancan desde el rizoma, que puede alcanzar 20??m de largo, es grueso, ramificados, con numerosos cat??filos, profundamente enraizado en el fondo.\n" +
                            "\n" +
                            "Flores de 16-23??cm de di??metro, rosa vivo a p??lido o blancas, olorosas, con p??talos c??ncavos, oblongo-el??pticos a obovados, 5-10 ?? 3-5??cm; anteras de 1-2??cm de largo; ped??nculos normalmente con ac??leos, sobrepasando la altura de las hojas.\n" +
                            "Los frutos complejos est??n formados por un recept??culo elipsoidal, de 5-10??cm de di??metro, de lados rugosos a d??bilmente estriados, con el ??pice truncado y plano, y las n??culas insertas en fosetas en ??l. N??culas de 10-20 ?? 7-13??mm, ovoides, usualmente m??s de 1,5. Florece al final de primavera y en verano. ");
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
                    intent.putExtra("texto", "Las hortensias nacen desde el inicio de la primavera hasta finales del oto??o; ??stas se encuentran agrupadas en ramos en el extremo de los tallos. Cada flor individual de hortensia es relativamente peque??a; sin embargo, el despliegue de color est?? acrecentado por un c??rculo de br??cteas modificadas alrededor de cada flor.\n" +
                            "\n" +
                            "Sus flores pueden ser rosas, blancas, o azules, dependiendo en parte del pH del suelo. En suelos relativamente ??cidos, con pH entre 4,5 y 5, las flores se hacen azules; en suelos m??s alcalinos, con pH entre 6 y 6,5, las flores adquieren un color rosa; y en suelos alcalinos con pH alrededor de 8, las flores crecen blancas. ");
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
                    intent.putExtra("texto", "Es un peque??o ??rbol o arbusto caducifolio poco ramificado, que puede alcanzar hasta 4 m de altura. Hojas lanceoladas u ovadas-el??pticas, pueden ser enteras o dentadas. Tallos gruesos y lisos. Las hojas, de m??rgenes lisos o dentados, son simples, dispuestas de manera alterna, de forma ovada a el??ptica, venosas, sinuosas y con dos senos laterales profundos limitados por crestas subagudas. Las inflorescencias en el ??pice de los tallos est??n formadas por una ??nica flor femenina sin p??talos ni s??palos, rodeada por flores masculinas individuales contenidas en una estructura denominada ciato exclusiva del g??nero Euphorbia. De cada ciato surge una gl??ndula bilabiada de color amarillo. Estas inflorescencias est??n rodeadas por largas br??cteas de color rojo que conforman la parte superior de la planta con la apariencia de llamativas flores. Se han creado cultivares con br??cteas de diferentes colores.8\u200B 9\u200B\n" +
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
                    intent.putExtra("texto", " Es una planta de ciclo anual que puede alcanzar m??s de 50 cm de altura. Posee tallos erectos y poco ramificados con finos pelillos. Las hojas, que nacen alternas a lo largo del tallo, sin peciolo, son pinnadas y muy dentadas en los m??rgenes con una ??nica nervadura central. Las flores, de color escarlata intenso, acampanadas y casi esf??ricas, poseen cuatro finos p??talos y dos s??palos vellosos. Los p??talos son muy delicados y se marchitan r??pidamente, por lo que las flores no puede usarse en adornos florales. Los estambres, de color negro, forman un racimo anillado alrededor del gineceo, lo que le da el aspecto de bot??n negro. El fruto es una c??psula unilocular con falsos tabiques, verde p??lido, de forma ovalada/subglobosa, truncada por una especie de tapa en la parte superior (disco) con 8-18 radios y con numerosas semillas inframilim??tricas, que escapan a trav??s de poros debajo del disco superior (dehiscencia por??cida). Dichas diminutas semillas son, como en todas las especies del g??nero, de forma arri??onada, alveoladas con ret??culo poligonal y de color pardo. Florecen de principio a final de la primavera. No resisten los climas c??lidos ni la humedad.[cita??requerida]\n" +
                            "Detalle de los aparatos reproductores\n" +
                            "\n" +
                            "La amapola se ha asociado a la agricultura desde ??pocas antiguas. Su ciclo de vida se adapta a la mayor??a de los cultivos de cereales, florecen y granan antes de la recolecci??n de las cosechas. Aunque se la considera una mala hierba, es f??cil de combatir con los habituales m??todos de control de plagas.");
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
                    intent.putExtra("texto", "Azahar o flor de azahar es el nombre de las flores blancas del naranjo, del limonero y del cidro.1\u200B El nombre procede del ??rabe hisp??nico az-zah??r, y este, del ??rabe cl??sico az-zahr (que significa 'flor'). El nombre se asocia popularmente a la flor de naranjo, la m??s apreciada de todas por su belleza, aroma y propiedades, las cuales son tradicionalmente consideradas terap??uticas.\n" +
                            "\n" +
                            "Es ingrediente esencial en varias infusiones por sus propiedades sedantes.2\u200B De la flor de azahar se destila tambi??n aceite esencial, aceite de flores de naranjo o neroli.\n" +
                            "\n" +
                            "Este tipo de flor puede observarse durante la ??poca primaveral no solo en los campos de cultivo de las citadas especies, sino tambi??n en las calles y plazas de muchas ciudades espa??olas (especialmente Valencia, Murcia, M??laga, C??rdoba y Sevilla), donde se utiliza como ??rbol ornamental y su agradable fragancia invade el ambiente urbano. En Andaluc??a y la Regi??n de Murcia se suele relacionar adem??s con la Semana Santa, ya que suele brotar en los d??as que anteceden a la misma. Mientras que en la Comunitat Valencia se la asocia a la flor nacional del territorio. ");
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
                    intent.putExtra("texto", "Los lirios son herb??ceas perennes de tallos erectos con numerosas hojas alternas, lineares a lanceoladas. Crecen a partir de bulbos formados por escamas carnosas sin t??nica.\n" +
                            "En algunas especies norteamericanas la base del bulbo desarrolla rizomas sobre los que se encuentran numerosos bulbillos peque??os. Otras desarrollan estolones. La mayor??a de los bulbos est??n profundamente enterrados, sin embargo unos cuantos se forman cerca de la superficie del suelo.\n" +
                            "Hay especies que desarrollan ra??ces adventicias en el tallo, con ellas, el bulbo crece de forma natural a cierta profundidad y cada a??o el nuevo tallo, a medida que emerge del suelo, emite ra??ces adventicias por encima del bulbo. Estas son adicionales a las ra??ces basales.\n" +
                            "\n" +
                            "La mayor??a de especies pierden la parte a??rea en invierno, excepto unas cuantas (como Lilium candidum, Lilium catesbaei) que mantienen una roseta de hojas basales durante el periodo de inactividad invernal.\n" +
                            "La inflorescencia es terminal, en racimo o umbela, con una sola flor o hasta 25. Las flores en las especies pueden ser colgantes, erectas, ascendentes u horizontales; con perianto en forma de campana o embudo recurvados o reflejos. Tienen 6 t??palos en una variedad de colores que abarca el blanco, amarillo, naranja, rosa o rojo, con manchas o puntos magenta o marr??n. Los estambres son 6. El fruto es una c??psula con tres valvas, m??s o menos oblonga, de color verde torn??ndose marr??n al madurar. Puede contener m??s de trescientas semillas.");
                    intent.putExtra("imagen", R.drawable.lirio);
                    startActivity(intent);
                }
            });
        cv8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this, Card.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    intent.putExtra("titulo", "Tulip??n");
                    intent.putExtra("texto", "Son plantas herb??ceas y bulbosas. Los bulbos son truncados basalmente y elongados hacia el ??pice, cubiertos por una t??nica usualmente pilosa por dentro. El tallo es simple (ocasionalmente ramificado) y subterr??neo en su porci??n basal. Las hojas son basales y caulinares, espaciadas o m??s o menos arrosetadas, lineales, aovadas o lanceoladas.\n" +
                            "\n" +
                            "Las flores son actinomorfas y hermafroditas, erguidas o, m??s raramente, p??ndulas, y se hallan dispuestas en n??mero de 1 a 3 en la extremidad de los tallos flor??feros. El perigonio es anchamente infundibuliforme o acampanado, compuesto de t??palos libres, subiguales, generalmente anchos e imbricados, coloreados, frecuentemente con un diminuto mech??n de pelos blancos en el ??pice. El androceo est?? formado por seis estambres, inclusos, con los filamentos aplanados y las anteras oblongas. El ovario es s??pero, trilocular, pluriovulado. El estilo es columnar o muy corto, el estigma es trilobado. El fruto es una c??psula loculicida, pluriseminada. Las semillas suelen ser planas, subdeltoideas.");
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
                    intent.putExtra("texto", "Planta de tallos erectos cuya altura var??a entre los 60 y 120 cm. Las hojas bipinnadas est??n divididas en segmentos filiformes finamente cortados. Las diferentes variedades tienen flores en tonos rosa, p??rpura y blanco.\n" +
                            "Algunas con dos de estos colores en la misma flor. Se considera una planta anual semirresistente, aunque pueden aparecer plantas durante varios a??os debido a la autosiembra (las semillas germinan al caer sobre la tierra). ");
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
                    intent.putExtra("texto", "Los girasoles son plantas anuales (como lo indica su nombre espec??fico lat??n: annuus) que pueden medir tres metros de alto. Los tallos son generalmente erectos e hispidos. La mayor??a de las hojas son caulinares, alternas, pecioladas, con base cordiforme y bordes aserrados. La cara inferior es usualmente m??s o menos hispida, a veces glandulosa y la superior glabra. El involucro es hemiesf??rico o anchado y mide 15-40??mm y hasta m??s de 20??cm. Las br??cteas invol??crales llamadas filiaros se encuentran en n??mero de 20-30, y hasta m??s de 100, ovaladas a lanceoladas ???brutalmente estrechadas en el ??pice??? nerviadas longitudinalmente, con el borde generalmente hispido o hirsuto, al igual que sus caras exteriores, raramente son glabras. Recept??culo con escamas centim??tricas tridentadas, con el diente mediano m??s grande y la punta hirsuta. Las l??gulas, en n??mero de 15-30, y hasta 100, de color amarillo a anaranjado hasta rojas, miden 2,5-5??cm; los fl??sculos, de 150 hasta 1000, del mismo color con los estambres pardos-rojizos. Los frutos son aquenios ovalados, algo truncados en la base, de 3-15??mm de largo, glabros o casi, estriados por fin??simos surcos verticales, de color oscuro, generalmente casi negras ???aunque pueden ser tambi??n blanquecinas, rojizas, de color miel o bien moteados o con bandas longitudinales m??s claras???. El vilano consiste en dos escamas lanceoladas de 2-3,5??mm acompa??adas, o no, de hasta cuatro escamitas obtusas de 0,5-1??mm, todas tempranamente caedizas. (como lo indica su nombre espec??fico lat??n: annuus) ");
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
                    intent.putExtra("texto", "El clavel o clavelina (Dianthus caryophyllus) es una planta herb??cea perteneciente a la familia de las Caryophyllaceae, es considerada como flor del agua, difundida en las regiones mediterr??neas. Es espont??nea en la flora de la pen??nsula ib??rica. En su forma t??pica es una planta cespitosa, con numerosos v??stagos de hasta 1??m de altura. Sus hojas son lineales, angostas, opuestas y envainadoras, m??s anchas las basales que las caulinares. Cada tallo forma una flor terminal. Sus flores son vistosas, pedunculadas en pan??cula o cima laxa, a veces solitarias, de bordes m??s o menos dentados.\n" +
                            "\n" +
                            "La planta perenne de base le??osa alcanza una altura entre los 45 y los 60 cm. La floraci??n se produce durante casi todo el a??o. Normalmente son flores de fuerte fragancia. Es la flor nacional de Espa??a. ");
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
                    intent.putExtra("texto", "Planta herb??cea perenne, ocasionalmente con peque??os rizomas, glabrescentes o laxamente pubescentes y hojas obovado-espatuladas, crenadas o dentada-redondeadas de 10-60 por 4-20 mm. Escapos sin hojas de hasta 20 cm de altura.1\u200B Las br??cteas involucrales tienen pelos pluricelulares m??s o menos abundantes en el dorso. Las flores hemiliguladas de 5,5-8,5 mm, sobrepasan el involucro en 2-5 mm, y tienen un tubo de 0,3-0,8 mm; son blancas, a veces te??idas de p??rpura; los fl??sculos, amarillos, tienen 1,5-2 mm. El fruto es un aquenio de 1-1,5 por 0,5-1 mm, obovoideo, comprimido, algo peludo, con borde perif??rico engrosado; vilano ausente.\n" +
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