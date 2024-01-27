package com.gl.univ.configs;

import com.gl.univ.models.*;
import com.gl.univ.services.interfaces.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyCommandLineRunner implements CommandLineRunner {
    @Autowired
    UserService userService;
    @Autowired
    CategoryService categoryService;
    @Autowired
    CityService cityService;

    @Autowired
    EtablishmentService etablishmentService;

    @Autowired
    SectorService sectorService;

   @Autowired
    SpecialityService specialityService;

    @Autowired
    RoleService roleService;

    @Autowired
    UniversityService universityService;

    @Override
    public void run(String... args) throws Exception {

        //save all user
        userService.save(new User(
                1,
                "djefferson",
                "tsafack",
                "tsafackjefferson2001@gmail.com",
                "abc123",
                "profilImage")
        );

        userService.save(new User(
                2,
                "djeff323",
                "tsafack12",
                "tsafackjefferson21@gmail.com",
                "abc123",
                "profilImage")
        );
        userService.save(new User(
                2,
                "choco",
                "djeff",
                "tsafackjeff21@gmail.com",
                "abc123",
                "profilImage")
        );

        userService.save(new User(
                3,
                "chiva",
                "djoco",
                "tsajco21@gmail.com",
                "abc123",
                "profilImage")
        );

        userService.save(new User(
                4,
                "crish",
                "ronaldo",
                "tsaronaldo21@gmail.com",
                "abc123",
                "profilImage")
        );

        userService.save(new User(
                5,
                "lonel",
                "messi",
                "messiaronaldo21@gmail.com",
                "abc123",
                "profilImage")
        );

        //Save All Role
        roleService.save(new Role(1,"admin"));
        roleService.save(new Role(2,"user"));

        // for the category
        categoryService.save(new Category(1,"Public"));
        categoryService.save(new Category(2,"Privé"));

        //save all city in db
        cityService.save(new City(1,"dschang"));
        cityService.save(new City(2,"Bangangté"));
        cityService.save(new City(3,"douala"));
        cityService.save(new City(4,"yaounde"));
        cityService.save(new City(5,"Maroua"));
        cityService.save(new City(6,"Ngaoundéré"));
        cityService.save(new City(7,"bafoussam"));
        cityService.save(new City(8,"foumban"));
        cityService.save(new City(9,"Bamenda"));
        cityService.save(new City(10,"Buea"));

        //save all establishmanent
        etablishmentService.save(new Etablishment(1,"university"));
        etablishmentService.save(new Etablishment(2,"Training center"));

        //save all sector
        sectorService.save(
                new Sector(1,
                        "informatique",
                        "pour faire cette filiere vous devez avoir un baccaloréat c",
                        "vous devez avoir au moin un bac c pour une bonne formation",
                        150,
                        "la formation dur 6 semestre il vous devez payer 150 par semestre"));

        sectorService.save(
                new Sector(2,
                        "medecine",
                        "pour faire cette filiere vous devez avoir un baccaloréat c,d,e",
                        "au sortie de cette formation, vous serez un super medecin competent",
                        150000,
                        "la formation dur 12 semestre il vous devez payer 1500000 par semestre")
        );


        sectorService.save(
                new Sector(3,
                        "infographie",
                        "avoir une bonne mettrice de photoshop et de l'univer adobe",
                        "au sortie de cette formation, vous serez un disigneur graphiuqe proffessionnel",
                        400000,
                        "la formation dur 4 semestre il vous devez payer 40000f par semestre")
        );


        sectorService.save(
                new Sector(4,
                        "infographie",
                        "avoir une bonne mettrice de photoshop et de l'univer adobe",
                        "au sortie de cette formation, vous serez un disigneur graphiuqe proffessionnel",
                        400000,
                        "la formation dur 4 semestre il vous devez payer 40000f par semestre"
                )
        );

        sectorService.save(
                new Sector(5,
                        "infographie et cyber securité",
                        "avoir une bonne en informatique et une metrice de quelle que language de programmation",
                        "au sortie de cette formation, vous serez un expert en cyber securité proffessionnel",
                        400000,
                        "la formation dur 4 semestre il vous devez payer 40000f par semestre"
                )
        );

        universityService.save(
                new University(
                        1,
                        "Université de Yaoundé I",
                        "assets/univ/yde1.jpg",
                        "Fondée en 1962, elle offre divers programmes en sciences, arts, sciences humaines et sociales.",
                        "+237 222 23 13 50",
                        "uy1.uninet.cm](http://www.uy1.uninet.cm/",
                        new Etablishment(1,"university"),
                        new Category(1,"public"),
                        new City(4,"yaounde"),
                        new User(
                                1,
                                "djefferson",
                                "tsafack",
                                "tsafackjefferson2001@gmail.com",
                                "abc123",
                                "profilImage")
                )
        );

        universityService.save(
                new University(
                        2,
                        "Université de Douala",
                        "assets/univ/douala.png",
                        "Créée en 1977, elle est connue pour ses programmes en commerce, économie et ingénierie.",
                        "+237 233 40 15 85",
                        "http://www.univ-douala.com/",
                        new Etablishment(1,"university"),
                        new Category(1,"public"),
                        new City(2,"yaounde"),
                        new User(
                                1,
                                "djefferson",
                                "tsafack",
                                "tsafackjefferson2001@gmail.com",
                                "abc123",
                                "profilImage")
                )
        );

        universityService.save(
                new University(
                        3,
                        "Université de Dschang",
                        "assets/univ/dschang.png",
                        "Spécialisée en agriculture, sciences, et technologie.",
                        "+237 233 45 13 81",
                        "http://www.univ-dschang.org/",
                        new Etablishment(1,"university"),
                        new Category(1,"public"),
                        new City(1,"yaounde"),
                        new User(
                                2,
                                "djefferson",
                                "tsafack",
                                "tsafackjefferson2001@gmail.com",
                                "abc123",
                                "profilImage")
                )
        );


        universityService.save(
                new University(
                        4,
                        "Université de Buea",
                        "assets/univ/buea.png",
                        "Fondée en 1985, elle offre des programmes en arts, sciences, ingénierie, et éducation.",
                        "+237 233 32 22 82",
                        "http://www.ubuea.cm/",
                        new Etablishment(1,"university"),
                        new Category(1,"public"),
                        new City(10,"yaounde"),
                        new User(
                                2,
                                "djefferson",
                                "tsafack",
                                "tsafackjefferson2001@gmail.com",
                                "abc123",
                                "profilImage")
                )
        );

        universityService.save(
                new University(
                        5,
                        "Université Catholique d'Afrique Centrale",
                        "assets/univ/catholique.png",
                        "Institution privée offrant des formations en sciences sociales, santé, et gestion",
                        "+237 222 23 74 00",
                        "http://www.ucac-icy.net/",
                        new Etablishment(1,"university"),
                        new Category(2,"public"),
                        new City(4,"yaounde"),
                        new User(
                                2,
                                "djefferson",
                                "tsafack",
                                "tsafackjefferson2001@gmail.com",
                                "abc123",
                                "profilImage")
                )
        );

        universityService.save(
                new University(
                        6,
                        "Université de Ngaoundéré",
                        "assets/univ/ngaoundere.png",
                        "Offre des programmes variés avec un accent sur l'agro-pastoralisme",
                        "+237 222 25 89 90",
                        "http://www.univ-ndere.cm/",
                        new Etablishment(1,"university"),
                        new Category(1,"public"),
                        new City(6,"yaounde"),
                        new User(
                                2,
                                "djefferson",
                                "tsafack",
                                "tsafackjefferson2001@gmail.com",
                                "abc123",
                                "profilImage")
                )
        );


        universityService.save(
                new University(
                        7,
                        "Université Saint Thomas d'Aquin",
                        "assets/univ/saintthomaq.jpg",
                        "Université privée focalisée sur les humanités et les sciences sociales.",
                        "+237 222 21 70 90",
                        "http://www.usta.cm/",
                        new Etablishment(1,"university"),
                        new Category(2,"public"),
                        new City(4,"yaounde"),
                        new User(
                                2,
                                "djefferson",
                                "tsafack",
                                "tsafackjefferson2001@gmail.com",
                                "abc123",
                                "profilImage")
                )
        );

        universityService.save(
                new University(
                        8,
                        "Université de Bamenda",
                        "assets/univ/buea.png",
                        "Offre un éventail de programmes, notamment en éducation et en arts.",
                        "+237 222 21 70 90",
                        "http://www.usta.cm/",
                        new Etablishment(1,"university"),
                        new Category(1,"public"),
                        new City(9,"Bamenda"),
                        new User(
                                2,
                                "djefferson",
                                "tsafack",
                                "tsafackjefferson2001@gmail.com",
                                "abc123",
                                "profilImage")
                )
        );

        universityService.save(
                new University(
                        9,
                        "Université des Montagnes",
                        "assets/univ/montagne.png",
                        "Focus sur les sciences de la santé, l'ingénierie et la technologie.",
                        "+237 233 31 18 45",
                        "https://www.udm.africa/",
                        new Etablishment(1,"university"),
                        new Category(1,"public"),
                        new City(2,"Bangangté"),
                        new User(
                                2,
                                "djefferson",
                                "tsafack",
                                "tsafackjefferson2001@gmail.com",
                                "abc123",
                                "profilImage")
                )
        );

        universityService.save(
                new University(
                        10,
                        "Université de Maroua",
                        "assets/univ/maroua.png",
                        "Spécialisée dans l'éducation des enseignants et des formations techniques.",
                        "+237 222 29 08 08",
                        "http://www.univ-maroua.cm/",
                        new Etablishment(1,"university"),
                        new Category(1,"public"),
                        new City(5,"Maroua"),
                        new User(
                                2,
                                "djefferson",
                                "tsafack",
                                "tsafackjefferson2001@gmail.com",
                                "abc123",
                                "profilImage")
                )
        );
    }
}
