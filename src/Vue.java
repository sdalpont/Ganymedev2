import javax.swing.*;
import javax.tools.Tool;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Vue extends JFrame {

    private List<CarteVaisseauColon> vaisseauColonList;
    private List<CarteVaisseauColon> mainVaisseauColon;
    private List<CarteVaisseauColon> boardVaisseauColon;
    private List<CarteVaisseauColon> defausseVaisseauColon;

    private List<TuileColon> tuileColonList;
    private List<TuileColon> mainTuileColon;
    private List<TuileColon> boardTuileColon;
    private List<TuileColon> deffauseTuile;

    private List<CarteMars> carteMarsList;
    private List<CarteMars> mainMarsList;
    private List<CarteMars> boardMarsList;
    private List<CarteMars> deffauseMarsList;

    private List<CarteTerre> carteTerreList;
    private List<CarteTerre> mainTerreList;
    private List<CarteTerre> boardTerreList;
    private List<CarteTerre> deffauseTerreList;

    private Model model;
    private JButton tirerCarte;



    public Vue(Model model) {

        this.model = model;
        vaisseauColonList = new ArrayList<>();
        mainVaisseauColon = new ArrayList<>();
        defausseVaisseauColon = new ArrayList<>();
        boardVaisseauColon = new ArrayList<>();

        tuileColonList = new ArrayList<>();
        mainTuileColon = new ArrayList<>();
        deffauseTuile = new ArrayList<>();
        boardTuileColon = new ArrayList<>();

        carteMarsList = new ArrayList<>();
        mainMarsList = new ArrayList<>();
        boardMarsList = new ArrayList<>();
        deffauseMarsList = new ArrayList<>();

        carteTerreList = new ArrayList<>();
        mainTerreList = new ArrayList<>();
        boardTerreList = new ArrayList<>();
        deffauseTerreList = new ArrayList<>();

        creerWidget();
        ajouterWigetVersion();
        pack();
        setTitle("Ganymede");
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xSize = ((int) tk.getScreenSize().getWidth());
        int ySize = ((int) tk.getScreenSize().getHeight());
        setSize(xSize,ySize);
        setVisible(true);                                 // Affiche la fenetre
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Gestion de la fermeture
    }

    private void creerWidget() {

        for (int i =0 ; i<2;i++){
            CarteVaisseauColon carte = new CarteVaisseauColon("C:/Users/simon/Desktop/Ganymede/src/img/navette/6PV.png", Effet.six_pv_si_utiliser_au_moins_une_navette_de_chaque);
            CarteVaisseauColon carte1 = new CarteVaisseauColon("C:/Users/simon/Desktop/Ganymede/src/img/navette/5pv.png", Effet.cinqPV);
            CarteVaisseauColon carte2 = new CarteVaisseauColon("C:/Users/simon/Desktop/Ganymede/src/img/navette/PV_egale_reput.png", Effet.pv_egale_reput);
            CarteVaisseauColon carte3 = new CarteVaisseauColon("C:/Users/simon/Desktop/Ganymede/src/img/navette/4PV_reput_plus_1.png", Effet.quatre_pv_plus_un_reput);
            CarteVaisseauColon carte4 = new CarteVaisseauColon("C:/Users/simon/Desktop/Ganymede/src/img/navette/4PV_1colon_terre.png", Effet.quatre_pv_recruter_colon_terre);
            CarteVaisseauColon carte5 = new CarteVaisseauColon("C:/Users/simon/Desktop/Ganymede/src/img/navette/4PV_moins1.png", Effet.quatre_pv_moins_un_colon_por_decole);
            CarteVaisseauColon carte6 = new CarteVaisseauColon("C:/Users/simon/Desktop/Ganymede/src/img/navette/4PV_2transfers.png", Effet.quatre_pv_plus_deux_transfers);
            CarteVaisseauColon carte7 = new CarteVaisseauColon("C:/Users/simon/Desktop/Ganymede/src/img/navette/2PV_type_navette_rouge.png", Effet.deuxPV_rouge_navette_fin_tour);
            CarteVaisseauColon carte8 = new CarteVaisseauColon("C:/Users/simon/Desktop/Ganymede/src/img/navette/2PV_type_navette_violet.png", Effet.deuxPV_violet_navette_fin_tour);
            CarteVaisseauColon carte9 = new CarteVaisseauColon("C:/Users/simon/Desktop/Ganymede/src/img/navette/2PV_type_navette_jaune.png", Effet.deuxPV_jaune_navette_fin_tour);
            CarteVaisseauColon carte10 = new CarteVaisseauColon("C:/Users/simon/Desktop/Ganymede/src/img/navette/2PV_type_navette_bleu.png", Effet.deuxPV_bleu_navette_fin_tour);
            CarteVaisseauColon carte11 = new CarteVaisseauColon("C:/Users/simon/Desktop/Ganymede/src/img/navette/2PV_type_navette.png", Effet.deuxPV_blanc_navette_fin_tour);
            CarteVaisseauColon carte12 = new CarteVaisseauColon("C:/Users/simon/Desktop/Ganymede/src/img/navette/1PV_par_symbole_colon_rouge.png", Effet.un_pv_rouge_navtte);
            CarteVaisseauColon carte13 = new CarteVaisseauColon("C:/Users/simon/Desktop/Ganymede/src/img/navette/1PV_par_symbole_colon_jaune.png", Effet.un_pv_jaune_navtte);
            CarteVaisseauColon carte14 = new CarteVaisseauColon("C:/Users/simon/Desktop/Ganymede/src/img/navette/1PV_par_symbole_colon_bleu.png", Effet.un_pv_bleu_navtte);
            CarteVaisseauColon carte15 = new CarteVaisseauColon("C:/Users/simon/Desktop/Ganymede/src/img/navette/1PV_par_symbole_colon_violet.png", Effet.un_pv_violet_navtte);
            CarteVaisseauColon carte16 = new CarteVaisseauColon("C:/Users/simon/Desktop/Ganymede/src/img/navette/2PV_par_tuile.png", Effet.deux_pv_par_tuile_posseder_fin_partie);
            vaisseauColonList.add(carte1);
            vaisseauColonList.add(carte2);
            vaisseauColonList.add(carte3);
            vaisseauColonList.add(carte4);
            vaisseauColonList.add(carte5);
            vaisseauColonList.add(carte6);
            vaisseauColonList.add(carte7);
            vaisseauColonList.add(carte8);
            vaisseauColonList.add(carte9);
            vaisseauColonList.add(carte10);
            vaisseauColonList.add(carte11);
            vaisseauColonList.add(carte12);
            vaisseauColonList.add(carte13);
            vaisseauColonList.add(carte14);
            vaisseauColonList.add(carte15);
            vaisseauColonList.add(carte16);
            Collections.shuffle(vaisseauColonList);
        }

        for (int j = 0; j < 2 ; j++){
            TuileColon tuile1 = new TuileColon(EffetTuile.transfert_ou_recrute_jaune_type_blanc, Couleur.BLANC,"C:/Users/simon/Desktop/Ganymede/src/img/Tuile/transfert_ou_recrute_jaune_type_blanc.png");
            TuileColon tuile2 = new TuileColon(EffetTuile.recrute_bleu_ou_violet_type_violet, Couleur.BLANC,"C:/Users/simon/Desktop/Ganymede/src/img/Tuile/recrute_bleu_ou_violet_type_violet.png");
            TuileColon tuile3 = new TuileColon(EffetTuile.transfert_ou_recrute_violet_type_blanc, Couleur.BLANC,"C:/Users/simon/Desktop/Ganymede/src/img/Tuile/transfert_ou_recrute_violet_type_blanc.png");
            TuileColon tuile4 = new TuileColon(EffetTuile.transfert_ou_recrute_bleu_type_blanc, Couleur.BLANC,"C:/Users/simon/Desktop/Ganymede/src/img/Tuile/transfert_ou_recrute_bleu_type_bleu.png");
            TuileColon tuile5 = new TuileColon(EffetTuile.transfert_ou_reput_type_blanc, Couleur.BLANC,"C:/Users/simon/Desktop/Ganymede/src/img/Tuile/transfert_ou_reput_type_blanc.png");
            TuileColon tuile6 = new TuileColon(EffetTuile.transdert_plus_decolage_fuse, Couleur.BLANC,"C:/Users/simon/Desktop/Ganymede/src/img/Tuile/transdert_plus_decolage_fuse.png");

            TuileColon tuile7 = new TuileColon(EffetTuile.recrute_bleu_ou_violet_type_violet, Couleur.VIOLET,"C:/Users/simon/Desktop/Ganymede/src/img/Tuile/recrute_bleu_ou_violet_type_violet.png");
            TuileColon tuile8 = new TuileColon(EffetTuile.transfert_ou_recrute_violet_type_violet, Couleur.VIOLET,"C:/Users/simon/Desktop/Ganymede/src/img/Tuile/transfert_ou_recrute_violet_type_violet.png");
            TuileColon tuile9 = new TuileColon(EffetTuile.recrute_violet_ou_bleu_type_violet, Couleur.VIOLET,"C:/Users/simon/Desktop/Ganymede/src/img/Tuile/recrute_violet_ou_bleu_type_violet.png");
            TuileColon tuile10 = new TuileColon(EffetTuile.recrute_violet_ou_jaune_type_violet, Couleur.VIOLET,"C:/Users/simon/Desktop/Ganymede/src/img/Tuile/recrute_violet_ou_jaune_type_violet.png");
            TuileColon tuile11 = new TuileColon(EffetTuile.recrute_violet_ou_reputation_type_violet, Couleur.VIOLET,"C:/Users/simon/Desktop/Ganymede/src/img/Tuile/recrute_violet_ou_reputation_type_violet.png");
            TuileColon tuile12 = new TuileColon(EffetTuile.recrute_violet_plus_decolage_type_violet, Couleur.VIOLET,"C:/Users/simon/Desktop/Ganymede/src/img/Tuile/recrute_violet_plus_decolage_type_violet.png");

            TuileColon tuile13 = new TuileColon(EffetTuile.recrute_bleu_ou_rouge_type_rouge, Couleur.ROUGE,"C:/Users/simon/Desktop/Ganymede/src/img/Tuile/recrute_bleu_ou_rouge_type_rouge.png");
            TuileColon tuile14 = new TuileColon(EffetTuile.recrute_rouge_ou_jaune_type_rouge, Couleur.ROUGE,"C:/Users/simon/Desktop/Ganymede/src/img/Tuile/recrute_rouge_ou_jaune_type_rouge.png");
            TuileColon tuile15 = new TuileColon(EffetTuile.recrute_rouge_ou_reptation_type_rouge, Couleur.ROUGE,"C:/Users/simon/Desktop/Ganymede/src/img/Tuile/recrute_rouge_ou_reptation_type_rouge.png");
            TuileColon tuile16 = new TuileColon(EffetTuile.recrute_rouge_ou_transfert_type_rouge, Couleur.ROUGE,"C:/Users/simon/Desktop/Ganymede/src/img/Tuile/recrute_rouge_ou_transfert_type_rouge.png");
            TuileColon tuile17 = new TuileColon(EffetTuile.recrute_rouge_ou_violet_type_rouge, Couleur.ROUGE,"C:/Users/simon/Desktop/Ganymede/src/img/Tuile/recrute_rouge_ou_violet_type_rouge.png");
            TuileColon tuile18 = new TuileColon(EffetTuile.recrute_rouge_plus_decole_type_rouge, Couleur.ROUGE,"C:/Users/simon/Desktop/Ganymede/src/img/Tuile/recrute_rouge_plus_decole_type_rouge.png");

            TuileColon tuile19 = new TuileColon(EffetTuile.recrute_bleu_ou_jaune_type_bleu, Couleur.BLEU,"C:/Users/simon/Desktop/Ganymede/src/img/Tuile/recrute_bleu_ou_jaune_type_bleu.png");
            TuileColon tuile20 = new TuileColon(EffetTuile.recrute_bleu_ou_repute_type_bleu, Couleur.BLEU,"C:/Users/simon/Desktop/Ganymede/src/img/Tuile/recrute_bleu_ou_repute_type_bleu.png");
            TuileColon tuile21 = new TuileColon(EffetTuile.recrute_bleu_ou_rouge_type_bleu, Couleur.BLEU,"C:/Users/simon/Desktop/Ganymede/src/img/Tuile/recrute_bleu_ou_rouge_type_bleu.png");
            TuileColon tuile22 = new TuileColon(EffetTuile.recrute_bleu_ou_violet_type_bleu, Couleur.BLEU,"C:/Users/simon/Desktop/Ganymede/src/img/Tuile/recrute_bleu_ou_violet_type_bleu.png");
            TuileColon tuile23 = new TuileColon(EffetTuile.recrute_bleu_plus_decole_type_bleu, Couleur.BLEU,"C:/Users/simon/Desktop/Ganymede/src/img/Tuile/recrute_bleu_plus_decole_type_bleu.png");
            TuileColon tuile24 = new TuileColon(EffetTuile.transfert_ou_recrute_bleu_type_bleu, Couleur.BLEU,"C:/Users/simon/Desktop/Ganymede/src/img/Tuile/transfert_ou_recrute_bleu_type_bleu.png");

            TuileColon tuile25 = new TuileColon(EffetTuile.recrute_jaune_ou_bleu_type_jaune, Couleur.JAUNE,"C:/Users/simon/Desktop/Ganymede/src/img/Tuile/recrute_jaune_ou_bleu_type_jaune.png");
            TuileColon tuile26 = new TuileColon(EffetTuile.recrute_jaune_ou_reput_type_jaune, Couleur.JAUNE,"C:/Users/simon/Desktop/Ganymede/src/img/Tuile/recrute_jaune_ou_reput_type_jaune.png");
            TuileColon tuile27 = new TuileColon(EffetTuile.recrute_jaune_ou_tansfert_type_jaune, Couleur.JAUNE,"C:/Users/simon/Desktop/Ganymede/src/img/Tuile/recrute_jaune_ou_tansfert_type_jaune.png");
            TuileColon tuile28 = new TuileColon(EffetTuile.recrute_jaune_ou_violet_type_jaune, Couleur.JAUNE,"C:/Users/simon/Desktop/Ganymede/src/img/Tuile/recrute_jaune_ou_violet_type_jaune.png");
            TuileColon tuile29 = new TuileColon(EffetTuile.recrute_jaune_plus_decole_type_jaune, Couleur.JAUNE,"C:/Users/simon/Desktop/Ganymede/src/img/Tuile/recrute_jaune_plus_decole_type_jaune.png");
            TuileColon tuile30 = new TuileColon(EffetTuile.recrute_jaune_ou_rouge_type_jaune, Couleur.JAUNE,"C:/Users/simon/Desktop/Ganymede/src/img/Tuile/recrute_jaune_ou_rouge_type_jaune.png");

            tuileColonList.add(tuile1);
            tuileColonList.add(tuile2);
            tuileColonList.add(tuile3);
            tuileColonList.add(tuile4);
            tuileColonList.add(tuile5);
            tuileColonList.add(tuile6);
            tuileColonList.add(tuile7);
            tuileColonList.add(tuile8);
            tuileColonList.add(tuile9);
            tuileColonList.add(tuile10);
            tuileColonList.add(tuile11);
            tuileColonList.add(tuile12);
            tuileColonList.add(tuile13);
            tuileColonList.add(tuile14);
            tuileColonList.add(tuile15);
            tuileColonList.add(tuile16);
            tuileColonList.add(tuile17);
            tuileColonList.add(tuile18);
            tuileColonList.add(tuile19);
            tuileColonList.add(tuile20);
            tuileColonList.add(tuile21);
            tuileColonList.add(tuile22);
            tuileColonList.add(tuile23);
            tuileColonList.add(tuile24);
            tuileColonList.add(tuile25);
            tuileColonList.add(tuile26);
            tuileColonList.add(tuile27);
            tuileColonList.add(tuile28);
            tuileColonList.add(tuile29);
            tuileColonList.add(tuile30);
            Collections.shuffle(tuileColonList);

            CarteTerre terre1 = new CarteTerre("C:/Users/simon/Desktop/Ganymede/src/img/terre/colon_violet_reput_type_blanc.png", ActionTerre.reput, DeplacementColonTerre.colon_violet, Couleur.BLANC);
            CarteTerre terre2 = new CarteTerre("C:/Users/simon/Desktop/Ganymede/src/img/terre/colon_type_blanc.png",null, DeplacementColonTerre.colon, Couleur.BLANC);
            CarteTerre terre3 = new CarteTerre("C:/Users/simon/Desktop/Ganymede/src/img/terre/colon_jaune_transfert_type_blanc.png", ActionTerre.transfert, DeplacementColonTerre.colon_jaune, Couleur.BLANC);
            CarteTerre terre4 = new CarteTerre("C:/Users/simon/Desktop/Ganymede/src/img/terre/colon_bleu_recrute_bleu_type_blanc.png", ActionTerre.recrute_bleu, DeplacementColonTerre.colon_bleu, Couleur.BLANC);
            CarteTerre terre5 = new CarteTerre("C:/Users/simon/Desktop/Ganymede/src/img/terre/colon_rouge_echnage_rouge_type_blanc.png", ActionTerre.echange_avec_rouge, DeplacementColonTerre.colon_rouge, Couleur.BLANC);
            CarteTerre terre6 = new CarteTerre("C:/Users/simon/Desktop/Ganymede/src/img/terre/colon_defausse_tuile_decole_type_blanc.png", ActionTerre.decole, DeplacementColonTerre.colon_defausse_tuile, Couleur.BLANC);

            CarteTerre terre7 = new CarteTerre("C:/Users/simon/Desktop/Ganymede/src/img/terre/bleu_violet_reput_type_bleu.png", ActionTerre.reput, DeplacementColonTerre.violet_bleu, Couleur.BLEU);
            CarteTerre terre8 = new CarteTerre("C:/Users/simon/Desktop/Ganymede/src/img/terre/bleu_type_bleu.png",null, DeplacementColonTerre.bleu, Couleur.BLEU);
            CarteTerre terre9 = new CarteTerre("C:/Users/simon/Desktop/Ganymede/src/img/terre/bleu_jaune_transfert_type_bleu.png", ActionTerre.transfert, DeplacementColonTerre.bleu_jaune, Couleur.BLEU);
            CarteTerre terre10 = new CarteTerre("C:/Users/simon/Desktop/Ganymede/src/img/terre/deux_bleu_recrute_colon_type_bleu.png", ActionTerre.recrute_colon, DeplacementColonTerre.deux_bleu, Couleur.BLEU);
            CarteTerre terre11 = new CarteTerre("C:/Users/simon/Desktop/Ganymede/src/img/terre/bleu_rouge_echnage_jaune_type_bleu.png", ActionTerre.echnage_avec_jaune, DeplacementColonTerre.bleu_rouge, Couleur.BLEU);
            CarteTerre terre12 = new CarteTerre("C:/Users/simon/Desktop/Ganymede/src/img/terre/bleu_defausse_tuile_recurte_colon_type_bleu.png", ActionTerre.recrute_colon, DeplacementColonTerre.bleu_defausse_tuile, Couleur.BLEU);

            CarteTerre terre13 = new CarteTerre("C:/Users/simon/Desktop/Ganymede/src/img/terre/rouge_violet_reput_type_rouge.png", ActionTerre.reput, DeplacementColonTerre.violet_rouge, Couleur.ROUGE);
            CarteTerre terre14 = new CarteTerre("C:/Users/simon/Desktop/Ganymede/src/img/terre/rouge_type_rouge.png",null, DeplacementColonTerre.rouge, Couleur.ROUGE);
            CarteTerre terre15 = new CarteTerre("C:/Users/simon/Desktop/Ganymede/src/img/terre/rouge_jaune_transfert_type_rouge.png", ActionTerre.transfert, DeplacementColonTerre.rouge_jaune, Couleur.ROUGE);
            CarteTerre terre16 = new CarteTerre("C:/Users/simon/Desktop/Ganymede/src/img/terre/rouge_bleu_echnage_violet_type_rouge.png", ActionTerre.recrute_violet, DeplacementColonTerre.rouge_bleu, Couleur.ROUGE);
            CarteTerre terre17 = new CarteTerre("C:/Users/simon/Desktop/Ganymede/src/img/terre/deux_rouge_echange_colon_type_rouge.png", ActionTerre.echange_avec_colon, DeplacementColonTerre.deux_rouge, Couleur.ROUGE);
            CarteTerre terre18 = new CarteTerre("C:/Users/simon/Desktop/Ganymede/src/img/terre/rouge_defausse_tuile_echnage_colon_type_rouge.png", ActionTerre.echange_avec_colon, DeplacementColonTerre.rouge_defausse_tuile, Couleur.ROUGE);

            CarteTerre terre19 = new CarteTerre("C:/Users/simon/Desktop/Ganymede/src/img/terre/deux_violet_reput_type_violet.png", ActionTerre.reput, DeplacementColonTerre.deux_violet, Couleur.VIOLET);
            CarteTerre terre20 = new CarteTerre("C:/Users/simon/Desktop/Ganymede/src/img/terre/violet_type_violet.png",null, DeplacementColonTerre.violet, Couleur.VIOLET);
            CarteTerre terre21 = new CarteTerre("C:/Users/simon/Desktop/Ganymede/src/img/terre/violet_jaune_transfert_type_violet.png", ActionTerre.transfert, DeplacementColonTerre.violet_jaune, Couleur.VIOLET);
            CarteTerre terre22 = new CarteTerre("C:/Users/simon/Desktop/Ganymede/src/img/terre/violet_bleu_echange_jaune_type_violet.png", ActionTerre.recrute_jaune, DeplacementColonTerre.violet_bleu, Couleur.VIOLET);
            CarteTerre terre23 = new CarteTerre("C:/Users/simon/Desktop/Ganymede/src/img/terre/violet_rouge_echange_bleu_type_violet.png", ActionTerre.echnage_avec_bleu, DeplacementColonTerre.violet_rouge, Couleur.VIOLET);
            CarteTerre terre24 = new CarteTerre("C:/Users/simon/Desktop/Ganymede/src/img/terre/violet_defausse_tuile_reput__type_violet.png", ActionTerre.reput, DeplacementColonTerre.violet_defausse_tuile, Couleur.VIOLET);

            CarteTerre terre25 = new CarteTerre("C:/Users/simon/Desktop/Ganymede/src/img/terre/jaune_violet_reput_type_jaune.png", ActionTerre.reput, DeplacementColonTerre.violet_jaune, Couleur.JAUNE);
            CarteTerre terre26 = new CarteTerre("C:/Users/simon/Desktop/Ganymede/src/img/terre/jaune_type_jaune.png",null, DeplacementColonTerre.jaune, Couleur.JAUNE);
            CarteTerre terre27 = new CarteTerre("C:/Users/simon/Desktop/Ganymede/src/img/terre/deux_juane_transfert_type_jaune.png", ActionTerre.transfert, DeplacementColonTerre.deux_jaune, Couleur.JAUNE);
            CarteTerre terre28 = new CarteTerre("C:/Users/simon/Desktop/Ganymede/src/img/terre/jaune_bleu_recrute_rouge_type_jaune.png", ActionTerre.recrute_rouge, DeplacementColonTerre.jaune_bleu, Couleur.JAUNE);
            CarteTerre terre29 = new CarteTerre("C:/Users/simon/Desktop/Ganymede/src/img/terre/jaune_rouge_echnage_violet_type_jaune.png", ActionTerre.echange_avec_violet, DeplacementColonTerre.jaune_rouge, Couleur.JAUNE);
            CarteTerre terre30 = new CarteTerre("C:/Users/simon/Desktop/Ganymede/src/img/terre/jaune_defausse_tuile_transfert_type_jaune.png", ActionTerre.transfert, DeplacementColonTerre.jaune_defausse_tuile, Couleur.JAUNE);

            carteTerreList.add(terre1);
            carteTerreList.add(terre2);
            carteTerreList.add(terre3);
            carteTerreList.add(terre4);
            carteTerreList.add(terre5);
            carteTerreList.add(terre6);
            carteTerreList.add(terre7);
            carteTerreList.add(terre8);
            carteTerreList.add(terre9);
            carteTerreList.add(terre10);
            carteTerreList.add(terre11);
            carteTerreList.add(terre12);
            carteTerreList.add(terre13);
            carteTerreList.add(terre14);
            carteTerreList.add(terre15);
            carteTerreList.add(terre16);
            carteTerreList.add(terre17);
            carteTerreList.add(terre18);
            carteTerreList.add(terre19);
            carteTerreList.add(terre20);
            carteTerreList.add(terre21);
            carteTerreList.add(terre22);
            carteTerreList.add(terre23);
            carteTerreList.add(terre24);
            carteTerreList.add(terre25);
            carteTerreList.add(terre26);
            carteTerreList.add(terre27);
            carteTerreList.add(terre28);
            carteTerreList.add(terre29);
            carteTerreList.add(terre30);
            Collections.shuffle(carteTerreList);


        }

        CarteMars mars1 = new CarteMars("C:/Users/simon/Desktop/Ganymede/src/img/mars/deplace_colon_bleu_defausse_tuile_recrute_colon_type_blanc.jpg", ActionMars.recrute_colon, DeplacementColonMars.deplace_colon_bleu_defausse_tuile, Couleur.BLANC);
        CarteMars mars2 = new CarteMars("C:/Users/simon/Desktop/Ganymede/src/img/mars/deplace_colon_bleu_violet_reput_type_blanc.jpg", ActionMars.reput, DeplacementColonMars.deplace_colon_bleu_violet, Couleur.BLANC);
        CarteMars mars3 = new CarteMars("C:/Users/simon/Desktop/Ganymede/src/img/mars/deplace_colon_jaune_transfert_type_blanc.jpg", ActionMars.transfert, DeplacementColonMars.deplace_colon_jaune, Couleur.BLANC);
        CarteMars mars4 = new CarteMars("C:/Users/simon/Desktop/Ganymede/src/img/mars/deplace_colon_rouge_echanger_colon_rouge_type_blanc.jpg", ActionMars.echanger_colon_rouge, DeplacementColonMars.deplace_colon_rouge, Couleur.BLANC);
        CarteMars mars5 = new CarteMars("C:/Users/simon/Desktop/Ganymede/src/img/mars/deplace_deux_colon_defausse_tuile_action_basique_type_blanc.jpg", ActionMars.action_basique, DeplacementColonMars.deplace_deux_colon_defausse_tuile, Couleur.BLANC);
        CarteMars mars6 = new CarteMars("C:/Users/simon/Desktop/Ganymede/src/img/mars/deplace_deux_colon_violet_action_basique_type_blanc.jpg", ActionMars.action_basique, DeplacementColonMars.deplace_deux_colon_violet, Couleur.BLANC);

        CarteMars mars7 = new CarteMars("C:/Users/simon/Desktop/Ganymede/src/img/mars/deplace_bleu_rouge_jaune_plus_recrute_violet_ou_bleu_type_bleu.jpg", ActionMars.recrute_violet_ou_bleu, DeplacementColonMars.deplace_bleu_rouge_jaune, Couleur.BLEU);
        CarteMars mars8 = new CarteMars("C:/Users/simon/Desktop/Ganymede/src/img/mars/deplace_bleu_rouge_violet_plus_reput_type_bleu.jpg", ActionMars.reput, DeplacementColonMars.deplace_bleu_rouge_violet, Couleur.BLEU);
        CarteMars mars9 = new CarteMars("C:/Users/simon/Desktop/Ganymede/src/img/mars/deplace_rouge_bleu_echanger_colon_contre_jaune_type_bleu.jpg", ActionMars.echanger_colon_contre_jaune, DeplacementColonMars.deplace_rouge_bleu, Couleur.BLEU);
        CarteMars mars10 = new CarteMars("C:/Users/simon/Desktop/Ganymede/src/img/mars/deplacer_bleu_et_jaune_plus_transfert_type_bleu.jpg", ActionMars.transfert, DeplacementColonMars.deplacer_bleu_et_jaune, Couleur.BLEU);
        CarteMars mars11 = new CarteMars("C:/Users/simon/Desktop/Ganymede/src/img/mars/deplacer_deux_bleu_defausser_tuile_recrute_rouge_ou_jaune_type_bleu.jpg", ActionMars.recrute_rouge_ou_jaune, DeplacementColonMars.deplacer_deux_bleu_defausser_tuile, Couleur.BLEU);
        CarteMars mars12 = new CarteMars("C:/Users/simon/Desktop/Ganymede/src/img/mars/deplacer_dex_colon_bleu_plus_defausser_tuile_plus_action_basiqe_type_bleu.png", ActionMars.action_basique, DeplacementColonMars.deplacer_dex_colon_bleu_plus_defausser_tuile, Couleur.BLEU);

        CarteMars mars13 = new CarteMars("C:/Users/simon/Desktop/Ganymede/src/img/mars/deplace_deux_jaune_bleu_recrute_colon_type_jaune.jpg", ActionMars.recrute_colon, DeplacementColonMars.deplace_deux_jaune_bleu, Couleur.JAUNE);
        CarteMars mars14 = new CarteMars("C:/Users/simon/Desktop/Ganymede/src/img/mars/deplace_deux_jaune_defausse_tuile_action_basique_type_jaune.jpg", ActionMars.action_basique, DeplacementColonMars.deplace_deux_jaune, Couleur.JAUNE);
        CarteMars mars15 = new CarteMars("C:/Users/simon/Desktop/Ganymede/src/img/mars/deplace_deux_jaune_transfert_type_jaune.jpg", ActionMars.transfert, DeplacementColonMars.deplace_deux_jaune, Couleur.JAUNE);
        CarteMars mars16 = new CarteMars("C:/Users/simon/Desktop/Ganymede/src/img/mars/deplace_jaune_rouge_echanger_colon_contre_violet_type_jaune.jpg", ActionMars.echanger_colon_contre_violet, DeplacementColonMars.deplace_jaune_rouge, Couleur.JAUNE);
        CarteMars mars17 = new CarteMars("C:/Users/simon/Desktop/Ganymede/src/img/mars/deplace_jaune_violet_bleu_reput_type_jaune.jpg", ActionMars.reput, DeplacementColonMars.deplace_jaune_violet_bleu, Couleur.JAUNE);
        CarteMars mars18 = new CarteMars("C:/Users/simon/Desktop/Ganymede/src/img/mars/deplace_jaune_violet_bleu_transfert_type_jaune.jpg", ActionMars.transfert, DeplacementColonMars.deplace_jaune_violet_bleu, Couleur.JAUNE);

        CarteMars mars19 = new CarteMars("C:/Users/simon/Desktop/Ganymede/src/img/mars/deplace_deux_violet_defausse_tuile_action_basique_type_violet.jpg", ActionMars.action_basique, DeplacementColonMars.deplace_deux_violet_defausse_tuile, Couleur.VIOLET);
        CarteMars mars20 = new CarteMars("C:/Users/simon/Desktop/Ganymede/src/img/mars/deplace_deux_violet_defausse_tuile_reput_type_violet.jpg", ActionMars.reput, DeplacementColonMars.deplace_deux_violet_defausse_tuile, Couleur.VIOLET);
        CarteMars mars21 = new CarteMars("C:/Users/simon/Desktop/Ganymede/src/img/mars/deplace_deux_violet_recrute_colon_type_violet.jpg", ActionMars.recrute_colon_type_violet, DeplacementColonMars.deplace_deux_violet, Couleur.VIOLET);
        CarteMars mars22 = new CarteMars("C:/Users/simon/Desktop/Ganymede/src/img/mars/deplace_violet_bleu_rouge_plus_reput_type_violet.jpg", ActionMars.reput, DeplacementColonMars.deplace_violet_bleu_rouge, Couleur.VIOLET);
        CarteMars mars23 = new CarteMars("C:/Users/simon/Desktop/Ganymede/src/img/mars/deplace_violet_jaune_transfert_type_violet.jpg", ActionMars.transfert, DeplacementColonMars.deplace_violet_jaune, Couleur.VIOLET);
        CarteMars mars24 = new CarteMars("C:/Users/simon/Desktop/Ganymede/src/img/mars/deplace_violet_rouge_echanger_avec_colon_bleu_type_violet.jpg", ActionMars.echanger_avec_colon_bleu_type_violet, DeplacementColonMars.deplace_violet_rouge, Couleur.VIOLET);

        CarteMars mars25 = new CarteMars("C:/Users/simon/Desktop/Ganymede/src/img/mars/deplace_deux_rouge_bleu_recruter_colon_type_rouge.jpg", ActionMars.recruter_colon, DeplacementColonMars.deplace_deux_rouge_bleu, Couleur.ROUGE);
        CarteMars mars26 = new CarteMars("C:/Users/simon/Desktop/Ganymede/src/img/mars/deplace_deux_rouge_defausse_tuile_action_basique_type_rouge.jpg", ActionMars.action_basique, DeplacementColonMars.deplace_deux_rouge_defausse_tuile, Couleur.ROUGE);
        CarteMars mars27 = new CarteMars("C:/Users/simon/Desktop/Ganymede/src/img/mars/deplace_deux_rouge_echnager_colon_type_rouge.jpg", ActionMars.echanger_colon, DeplacementColonMars.deplace_deux_rouge, Couleur.ROUGE);
        CarteMars mars28 = new CarteMars("C:/Users/simon/Desktop/Ganymede/src/img/mars/deplace_rouge_jaune_violet_plus_echanger_colon_type_rouge.jpg", ActionMars.echanger_colon, DeplacementColonMars.deplace_rouge_jaune_violet, Couleur.ROUGE);
        CarteMars mars29 = new CarteMars("C:/Users/simon/Desktop/Ganymede/src/img/mars/deplace_rouge_jaune_violet_plus_reput_type_rouge.jpg", ActionMars.reput, DeplacementColonMars.deplace_rouge_jaune_violet, Couleur.ROUGE);
        CarteMars mars30 = new CarteMars("C:/Users/simon/Desktop/Ganymede/src/img/mars/deplacer_rouge_jaune_transferts_type_rouge.jpg", ActionMars.transfert, DeplacementColonMars.deplacer_rouge_jaune, Couleur.ROUGE);

        carteMarsList.add(mars1);
        carteMarsList.add(mars2);
        carteMarsList.add(mars3);
        carteMarsList.add(mars4);
        carteMarsList.add(mars5);
        carteMarsList.add(mars6);
        carteMarsList.add(mars7);
        carteMarsList.add(mars8);
        carteMarsList.add(mars9);
        carteMarsList.add(mars10);
        carteMarsList.add(mars11);
        carteMarsList.add(mars12);
        carteMarsList.add(mars13);
        carteMarsList.add(mars14);
        carteMarsList.add(mars15);
        carteMarsList.add(mars16);
        carteMarsList.add(mars17);
        carteMarsList.add(mars18);
        carteMarsList.add(mars19);
        carteMarsList.add(mars20);
        carteMarsList.add(mars21);
        carteMarsList.add(mars22);
        carteMarsList.add(mars23);
        carteMarsList.add(mars24);
        carteMarsList.add(mars25);
        carteMarsList.add(mars26);
        carteMarsList.add(mars27);
        carteMarsList.add(mars28);
        carteMarsList.add(mars29);
        carteMarsList.add(mars30);
        Collections.shuffle(carteMarsList);

    }

    private void ajouterWigetVersion() {

        JPanel ligne_vaisseau = new JPanel();
        ligne_vaisseau.setLayout(new GridLayout(1,3) );

        getBoardVaisseauColon().add(getVaisseauColonList().get(0));
        getVaisseauColonList().remove(0);
        ligne_vaisseau.add(getBoardVaisseauColon().get(0));

        getBoardVaisseauColon().add(getVaisseauColonList().get(0));
        getVaisseauColonList().remove(0);
        ligne_vaisseau.add(getBoardVaisseauColon().get(1));

        getBoardVaisseauColon().add(getVaisseauColonList().get(0));
        getVaisseauColonList().remove(0);
        ligne_vaisseau.add(getBoardVaisseauColon().get(2));
        /*------------------------------------------------------------------------------------*/
        JPanel ligneTuile =  new JPanel();
        ligneTuile.setLayout(new GridLayout(1,4));

        getBoardTuileColon().add(getTuileColonList().get(0));
        getTuileColonList().remove(0);
        ligneTuile.add(getBoardTuileColon().get(0));

        getBoardTuileColon().add(getTuileColonList().get(0));
        getTuileColonList().remove(0);
        ligneTuile.add(getBoardTuileColon().get(1));

        getBoardTuileColon().add(getTuileColonList().get(0));
        getTuileColonList().remove(0);
        ligneTuile.add(getBoardTuileColon().get(2));

        getBoardTuileColon().add(getTuileColonList().get(0));
        getTuileColonList().remove(0);
        ligneTuile.add(getBoardTuileColon().get(3));

        /*-------------------------------------------------------------------------------------*/

        JPanel ligneMars =  new JPanel();
        ligneMars.setLayout(new GridLayout(1,4));

        getBoardMarsList().add(getCarteMarsList().get(0));
        getCarteMarsList().remove(0);
        ligneMars.add(getBoardMarsList().get(0));

        getBoardMarsList().add(getCarteMarsList().get(0));
        getCarteMarsList().remove(0);
        ligneMars.add(getBoardMarsList().get(1));

        getBoardMarsList().add(getCarteMarsList().get(0));
        getCarteMarsList().remove(0);
        ligneMars.add(getBoardMarsList().get(2));

        getBoardMarsList().add(getCarteMarsList().get(0));
        getCarteMarsList().remove(0);
        ligneMars.add(getBoardMarsList().get(3));

        /*----------------------------------------------------------------------------------------*/

        JPanel ligneTerre =  new JPanel();
        ligneTerre.setLayout(new GridLayout(1,4));

        getBoardTerreList().add(getCarteTerreList().get(0));
        getCarteTerreList().remove(0);
        ligneTerre.add(getBoardTerreList().get(0));


        getBoardTerreList().add(getCarteTerreList().get(0));
        getCarteTerreList().remove(0);
        ligneTerre.add(getBoardTerreList().get(1));

        getBoardTerreList().add(getCarteTerreList().get(0));
        getCarteTerreList().remove(0);
        ligneTerre.add(getBoardTerreList().get(2));

        getBoardTerreList().add(getCarteTerreList().get(0));
        getCarteTerreList().remove(0);
        ligneTerre.add(getBoardTerreList().get(3));

        /*----------------------------------------------------------------------------------------*/
        JButton colon = new JButton();
        JButton colon1 = new JButton();
        JButton colon2 = new JButton();

        JPanel colonGrid = new JPanel();
        colonGrid.setPreferredSize(new Dimension(150,150));
        colonGrid.add(colon);
        colonGrid.add(colon1);
        colonGrid.add(colon2);
        colonGrid.setLayout(new GridLayout(3,1));


        JButton mars = new JButton("mars");
        mars.setPreferredSize(new Dimension(100,150));
        JButton terre = new JButton("terre");
       terre.setPreferredSize(new Dimension(100,150));
        JButton vaiseauColon1 = new JButton("Vaisseau colon");
        vaiseauColon1.setPreferredSize(new Dimension(100,150));
        JButton vaiseauColon2 = new JButton("Vaisseau colon");
        vaiseauColon2.setPreferredSize(new Dimension(100,150));

        JPanel plateau = new JPanel();
        plateau.add(colonGrid);

        plateau.add(mars);
        plateau.add(terre);
        plateau.add(vaiseauColon1);
        plateau.add(vaiseauColon2);

        /*----------------------------------------------------------------------------------------*/


        JPanel fenetre = new JPanel();
        fenetre.add(ligne_vaisseau);

        JPanel fenetre1 = new JPanel();
        fenetre1.add(ligneTuile);

        JPanel fenetre2 = new JPanel();
        fenetre2.add(ligneMars);

        JPanel fenetre3 = new JPanel();
        fenetre3.add(ligneTerre);

        JPanel panAll = new JPanel();
        panAll.setPreferredSize(new Dimension(500,600));
        panAll.add(fenetre);
        panAll.add(fenetre1);
        panAll.add(fenetre2);
        panAll.add(fenetre3);
        panAll.add(plateau);
        setContentPane(panAll);

    }

    public  void setButtonController(ActionListener listener){
        for (CarteVaisseauColon carte: getBoardVaisseauColon()) {
            carte.addActionListener(listener);
        }
    }
    public  void setButtonController1(ActionListener listener){
        for (TuileColon tuile: getBoardTuileColon()) {
            tuile.addActionListener(listener);
        }
    }
    public  void setButtonController2(ActionListener listener){
        for (CarteMars mars: getBoardMarsList()) {
            mars.addActionListener(listener);
        }
    }

    public  void setButtonController3(ActionListener listener){
        for (CarteTerre terre: getBoardTerreList()) {
            terre.addActionListener(listener);
        }
    }

    /*---------------------Getter-Setter----------------------------*/
    public List<CarteVaisseauColon> getVaisseauColonList() {
        return vaisseauColonList;
    }
    public void setVaisseauColonList(List<CarteVaisseauColon> vaisseauColonList) {
        this.vaisseauColonList = vaisseauColonList;
    }
    public Model getModel() {
        return model;
    }
    public void setModel(Model model) {
        this.model = model;
    }
    public JButton getTirerCarte() {
        return tirerCarte;
    }
    public void setTirerCarte(JButton tirerCarte) {
        this.tirerCarte = tirerCarte;
    }
    public List<CarteVaisseauColon> getMainVaisseauColon() {
        return mainVaisseauColon;
    }

    public void setMainVaisseauColon(List<CarteVaisseauColon> mainVaisseauColon) {
        this.mainVaisseauColon = mainVaisseauColon;
    }
    public List<CarteVaisseauColon> getDefausseVaisseauColon() {
        return defausseVaisseauColon;
    }
    public void setDefausseVaisseauColon(List<CarteVaisseauColon> defausseVaisseauColon) {
        this.defausseVaisseauColon = defausseVaisseauColon;
    }
    public List<CarteVaisseauColon> getBoardVaisseauColon() {
        return boardVaisseauColon;
    }
    public void setBoardVaisseauColon(List<CarteVaisseauColon> boardVaisseauColon) {
        this.boardVaisseauColon = boardVaisseauColon;
    }

    public List<TuileColon> getTuileColonList() {
        return tuileColonList;
    }
    public void setTuileColonList(List<TuileColon> tuileColonList) {
        this.tuileColonList = tuileColonList;
    }
    public List<TuileColon> getMainTuileColon() {
        return mainTuileColon;
    }
    public void setMainTuileColon(List<TuileColon> mainTuileColon) {
        this.mainTuileColon = mainTuileColon;
    }
    public List<TuileColon> getBoardTuileColon() {
        return boardTuileColon;
    }
    public void setBoardTuileColon(List<TuileColon> boardTuileColon) {
        this.boardTuileColon = boardTuileColon;
    }
    public List<TuileColon> getDeffauseTuile() {
        return deffauseTuile;
    }
    public void setDeffauseTuile(List<TuileColon> deffauseTuile) {
        this.deffauseTuile = deffauseTuile;
    }
    public List<CarteMars> getCarteMarsList() {
        return carteMarsList;
    }
    public void setCarteMarsList(List<CarteMars> carteMarsList) {
        this.carteMarsList = carteMarsList;
    }
    public List<CarteMars> getMainMarsList() {
        return mainMarsList;
    }
    public void setMainMarsList(List<CarteMars> mainMarsList) {
        this.mainMarsList = mainMarsList;
    }
    public List<CarteMars> getBoardMarsList() {
        return boardMarsList;
    }
    public void setBoardMarsList(List<CarteMars> boardMarsList) {
        this.boardMarsList = boardMarsList;
    }
    public List<CarteMars> getDeffauseMarsList() {
        return deffauseMarsList;
    }
    public void setDeffauseMarsList(List<CarteMars> deffauseMarsList) {
        this.deffauseMarsList = deffauseMarsList;
    }
    public List<CarteTerre> getCarteTerreList() {
        return carteTerreList;
    }

    public void setCarteTerreList(List<CarteTerre> carteTerreList) {
        this.carteTerreList = carteTerreList;
    }

    public List<CarteTerre> getMainTerreList() {
        return mainTerreList;
    }

    public void setMainTerreList(List<CarteTerre> mainTerreList) {
        this.mainTerreList = mainTerreList;
    }

    public List<CarteTerre> getBoardTerreList() {
        return boardTerreList;
    }

    public void setBoardTerreList(List<CarteTerre> boardTerreList) {
        this.boardTerreList = boardTerreList;
    }

    public List<CarteTerre> getDeffauseTerreList() {
        return deffauseTerreList;
    }

    public void setDeffauseTerreList(List<CarteTerre> deffauseTerreList) {
        this.deffauseTerreList = deffauseTerreList;
    }
}
