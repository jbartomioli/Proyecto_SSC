package interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JTabbedPane;
import java.awt.Panel;
import java.awt.ScrollPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JInternalFrame;

public class anuncio extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					anuncio frame = new anuncio();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public anuncio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 509, 304);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Anestesia");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmBraquets = new JMenuItem("Anestesias");
		mnNewMenu.add(mntmBraquets);
		
		JMenu mnIndumentaria = new JMenu("Descartables");
		menuBar.add(mnIndumentaria);
		
		JMenuItem mntmGuardapolvos = new JMenuItem("Aplicadores");
		mnIndumentaria.add(mntmGuardapolvos);
		
		JMenuItem mntmAmboBlanco = new JMenuItem("Barbijos");
		mnIndumentaria.add(mntmAmboBlanco);
		
		JMenuItem mntmBaberos = new JMenuItem("Baberos");
		mnIndumentaria.add(mntmBaberos);
		
		JMenuItem mntmAlgodngasas = new JMenuItem("Algod\u00F3n/Gasas");
		mnIndumentaria.add(mntmAlgodngasas);
		
		JMenuItem mntmEquipos = new JMenuItem("Equipos");
		mnIndumentaria.add(mntmEquipos);
		
		JMenuItem mntmGuantes = new JMenuItem("Guantes");
		mnIndumentaria.add(mntmGuantes);
		
		JMenuItem mntmAgujasbistur = new JMenuItem("Agujas/Bistur\u00ED");
		mnIndumentaria.add(mntmAgujasbistur);
		
		JMenuItem mntmOtros = new JMenuItem("Otros");
		mnIndumentaria.add(mntmOtros);
		
		JMenu mnEquipos = new JMenu("Materiales p/obturaci\u00F3n");
		menuBar.add(mnEquipos);
		
		JMenuItem mntmCamillas = new JMenuItem("Aleaciones");
		mnEquipos.add(mntmCamillas);
		
		JMenuItem mntmSelladores = new JMenuItem("Selladores");
		mnEquipos.add(mntmSelladores);
		
		JMenuItem mntmAdhesivoscementos = new JMenuItem("Adhesivos/Cementos");
		mnEquipos.add(mntmAdhesivoscementos);
		
		JMenuItem mntmJeringas = new JMenuItem("Jeringas");
		mnEquipos.add(mntmJeringas);
		
		JMenuItem mntmcidos = new JMenuItem("\u00C1cidos");
		mnEquipos.add(mntmcidos);
		
		JMenuItem mntmIonmeros = new JMenuItem("Ion\u00F3meros");
		mnEquipos.add(mntmIonmeros);
		
		JMenuItem mntmVarios = new JMenuItem("Varios");
		mnEquipos.add(mntmVarios);
		
		JMenu mnInsumos = new JMenu("Cementos/Prov/Acr\u00EDlicos");
		menuBar.add(mnInsumos);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Cementos");
		mnInsumos.add(mntmNewMenuItem);
		
		JMenuItem mntmMonmeros = new JMenuItem("Mon\u00F3meros");
		mnInsumos.add(mntmMonmeros);
		
		JMenuItem mntmAcrlicos = new JMenuItem("Acr\u00EDlicos");
		mnInsumos.add(mntmAcrlicos);
		
		JMenuItem mntmVarios_1 = new JMenuItem("Varios");
		mnInsumos.add(mntmVarios_1);
		
		JMenu mnMaterialesP = new JMenu("Materiales p/impresi\u00F3n");
		menuBar.add(mnMaterialesP);
		
		JMenuItem mntmYesos = new JMenuItem("Yesos");
		mnMaterialesP.add(mntmYesos);
		
		JMenuItem mntmCeras = new JMenuItem("Ceras");
		mnMaterialesP.add(mntmCeras);
		
		JMenuItem mntmActivadores = new JMenuItem("Activadores");
		mnMaterialesP.add(mntmActivadores);
		
		JMenuItem mntmAlginatos = new JMenuItem("Alginatos");
		mnMaterialesP.add(mntmAlginatos);
		
		JMenuItem mntmPastas = new JMenuItem("Pastas");
		mnMaterialesP.add(mntmPastas);
		
		JMenuItem mntmVarios_2 = new JMenuItem("Varios");
		mnMaterialesP.add(mntmVarios_2);
		
		JMenu mnEndodoncia = new JMenu("Endodoncia");
		menuBar.add(mnEndodoncia);
		
		JMenuItem mntmPastas_1 = new JMenuItem("Pastas");
		mnEndodoncia.add(mntmPastas_1);
		
		JMenuItem mntmEspaciadores = new JMenuItem("Espaciadores");
		mnEndodoncia.add(mntmEspaciadores);
		
		JMenuItem mntmEscareadores = new JMenuItem("Escareadores");
		mnEndodoncia.add(mntmEscareadores);
		
		JMenuItem mntmLimas = new JMenuItem("Limas");
		mnEndodoncia.add(mntmLimas);
		
		JMenuItem mntmCuas = new JMenuItem("Cu\u00F1as");
		mnEndodoncia.add(mntmCuas);
		
		JMenuItem mntmConos = new JMenuItem("Conos");
		mnEndodoncia.add(mntmConos);
		
		JMenuItem mntmMangos = new JMenuItem("Mangos");
		mnEndodoncia.add(mntmMangos);
		
		JMenuItem mntmTiranervios = new JMenuItem("Tiranervios");
		mnEndodoncia.add(mntmTiranervios);
		
		JMenuItem mntmPernos = new JMenuItem("Pernos");
		mnEndodoncia.add(mntmPernos);
		
		JMenuItem mntmPostes = new JMenuItem("Postes");
		mnEndodoncia.add(mntmPostes);
		
		JMenuItem mntmVarios_3 = new JMenuItem("Varios");
		mnEndodoncia.add(mntmVarios_3);
		
		JMenu mnRadiologa = new JMenu("Radiolog\u00EDa");
		menuBar.add(mnRadiologa);
		
		JMenuItem mntmPortaPelculas = new JMenuItem("Porta pel\u00EDculas");
		mnRadiologa.add(mntmPortaPelculas);
		
		JMenuItem mntmFijadoresreveladores = new JMenuItem("Fijadores/Reveladores");
		mnRadiologa.add(mntmFijadoresreveladores);
		
		JMenuItem mntmRadiografas = new JMenuItem("Radiograf\u00EDas");
		mnRadiologa.add(mntmRadiografas);
		
		JMenuItem mntmVarios_4 = new JMenuItem("Varios");
		mnRadiologa.add(mntmVarios_4);
		
		JMenu mnInstrumental = new JMenu("Instrumental");
		menuBar.add(mnInstrumental);
		
		JMenuItem mntmExtractores = new JMenuItem("Extractores");
		mnInstrumental.add(mntmExtractores);
		
		JMenuItem mntmLimasPhueso = new JMenuItem("Limas p/hueso");
		mnInstrumental.add(mntmLimasPhueso);
		
		JMenuItem mntmJeringas_1 = new JMenuItem("Jeringas");
		mnInstrumental.add(mntmJeringas_1);
		
		JMenuItem mntmCuretas = new JMenuItem("Curetas");
		mnInstrumental.add(mntmCuretas);
		
		JMenuItem mntmForceps = new JMenuItem("Forceps");
		mnInstrumental.add(mntmForceps);
		
		JMenuItem mntmEsptulas = new JMenuItem("Esp\u00E1tulas");
		mnInstrumental.add(mntmEsptulas);
		
		JMenuItem mntmEspaciadores_1 = new JMenuItem("Espaciadores");
		mnInstrumental.add(mntmEspaciadores_1);
		
		JMenuItem mntmAtacadores = new JMenuItem("Atacadores");
		mnInstrumental.add(mntmAtacadores);
		
		JMenuItem mntmExploradores = new JMenuItem("Exploradores");
		mnInstrumental.add(mntmExploradores);
		
		JMenuItem mntmBandejas = new JMenuItem("Bandejas");
		mnInstrumental.add(mntmBandejas);
		
		JMenuItem mntmMangos_1 = new JMenuItem("Mangos");
		mnInstrumental.add(mntmMangos_1);
		
		JMenuItem mntmObturadores = new JMenuItem("Obturadores");
		mnInstrumental.add(mntmObturadores);
		
		JMenuItem mntmOsteotomos = new JMenuItem("Osteotomos");
		mnInstrumental.add(mntmOsteotomos);
		
		JMenuItem mntmTijeras = new JMenuItem("Tijeras");
		mnInstrumental.add(mntmTijeras);
		
		JMenuItem mntmTambores = new JMenuItem("Tambores");
		mnInstrumental.add(mntmTambores);
		
		JMenuItem mntmTalladores = new JMenuItem("Talladores");
		mnInstrumental.add(mntmTalladores);
		
		JMenuItem mntmEspejos = new JMenuItem("Espejos");
		mnInstrumental.add(mntmEspejos);
		
		JMenuItem mntmVarios_5 = new JMenuItem("Cajas");
		mnInstrumental.add(mntmVarios_5);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Cubetas");
		mnInstrumental.add(mntmNewMenuItem_1);
		
		JMenuItem mntmExcavadores = new JMenuItem("Excavadores");
		mnInstrumental.add(mntmExcavadores);
		
		JMenuItem mntmPortaElementos = new JMenuItem("Porta elementos");
		mnInstrumental.add(mntmPortaElementos);
		
		JMenuItem mntmPinzas = new JMenuItem("Pinzas");
		mnInstrumental.add(mntmPinzas);
		
		JMenuItem mntmVarios_6 = new JMenuItem("Varios");
		mnInstrumental.add(mntmVarios_6);
		
		JMenu mnAparatologa = new JMenu("Aparatolog\u00EDa");
		menuBar.add(mnAparatologa);
		
		JMenuItem mntmMicromotores = new JMenuItem("Micromotores");
		mnAparatologa.add(mntmMicromotores);
		
		JMenuItem mntmCompresores = new JMenuItem("Compresores");
		mnAparatologa.add(mntmCompresores);
		
		JMenuItem mntmSacafresas = new JMenuItem("Sacafresas");
		mnAparatologa.add(mntmSacafresas);
		
		JMenuItem mntmTornos = new JMenuItem("Tornos");
		mnAparatologa.add(mntmTornos);
		
		JMenuItem mntmMdulos = new JMenuItem("M\u00F3dulos");
		mnAparatologa.add(mntmMdulos);
		
		JMenuItem mntmLmparas = new JMenuItem("L\u00E1mparas");
		mnAparatologa.add(mntmLmparas);
		
		JMenuItem mntmLavadoras = new JMenuItem("Lavadoras");
		mnAparatologa.add(mntmLavadoras);
		
		JMenuItem mntmContrangulos = new JMenuItem("Contra \u00E1ngulos");
		mnAparatologa.add(mntmContrangulos);
		
		JMenuItem mntmTurbinas = new JMenuItem("Turbinas");
		mnAparatologa.add(mntmTurbinas);
		
		JMenuItem mntmEsterilizadoras = new JMenuItem("Esterilizadoras");
		mnAparatologa.add(mntmEsterilizadoras);
		
		JMenuItem mntmGabinetes = new JMenuItem("Gabinetes");
		mnAparatologa.add(mntmGabinetes);
		
		JMenuItem mntmVarios_7 = new JMenuItem("Varios");
		mnAparatologa.add(mntmVarios_7);
		
		JMenu mnRotatorio = new JMenu("Rotatorio");
		menuBar.add(mnRotatorio);
		
		JMenuItem mntmFresasfresones = new JMenuItem("Fresas/Fresones");
		mnRotatorio.add(mntmFresasfresones);
		
		JMenuItem mntmCepillos = new JMenuItem("Cepillos");
		mnRotatorio.add(mntmCepillos);
		
		JMenuItem mntmPiedras = new JMenuItem("Piedras");
		mnRotatorio.add(mntmPiedras);
		
		JMenuItem mntmDiscos = new JMenuItem("Discos");
		mnRotatorio.add(mntmDiscos);
		
		JMenuItem mntmPulidores = new JMenuItem("Pulidores");
		mnRotatorio.add(mntmPulidores);
		
		JMenuItem mntmVarios_8 = new JMenuItem("Varios");
		mnRotatorio.add(mntmVarios_8);
		
		JMenu mnPapelera = new JMenu("Papeler\u00EDa");
		menuBar.add(mnPapelera);
		
		JMenuItem mntmChaquetas = new JMenuItem("Chaquetas");
		mnPapelera.add(mntmChaquetas);
		
		JMenuItem mntmAmbos = new JMenuItem("Ambos");
		mnPapelera.add(mntmAmbos);
		
		JMenuItem mntmPantalones = new JMenuItem("Pantalones");
		mnPapelera.add(mntmPantalones);
		
		JMenuItem mntmVarios_9 = new JMenuItem("Varios");
		mnPapelera.add(mntmVarios_9);
		
		JMenu mnMedicamentos = new JMenu("Medicamentos");
		menuBar.add(mnMedicamentos);
		
		JMenuItem mntmDetectores = new JMenuItem("Detectores");
		mnMedicamentos.add(mntmDetectores);
		
		JMenuItem mntmDesinfectantes = new JMenuItem("Desinfectantes");
		mnMedicamentos.add(mntmDesinfectantes);
		
		JMenuItem mntmPastas_2 = new JMenuItem("Pastas");
		mnMedicamentos.add(mntmPastas_2);
		
		JMenuItem mntmVarios_10 = new JMenuItem("Varios");
		mnMedicamentos.add(mntmVarios_10);
		
		JMenu mnOrtodoncia = new JMenu("Ortodoncia");
		menuBar.add(mnOrtodoncia);
		
		JMenuItem mntmCepillos_1 = new JMenuItem("Cepillos");
		mnOrtodoncia.add(mntmCepillos_1);
		
		JMenuItem mntmBlanqueadores = new JMenuItem("Blanqueadores");
		mnOrtodoncia.add(mntmBlanqueadores);
		
		JMenuItem mntmVasos = new JMenuItem("Vasos");
		mnOrtodoncia.add(mntmVasos);
		
		JMenuItem mntmPlacas = new JMenuItem("Placas");
		mnOrtodoncia.add(mntmPlacas);
		
		JMenuItem mntmEsponjeros = new JMenuItem("Esponjeros");
		mnOrtodoncia.add(mntmEsponjeros);
		
		JMenuItem mntmBucalTac = new JMenuItem("Bucal Tac");
		mnOrtodoncia.add(mntmBucalTac);
		
		JMenuItem mntmCoronitas = new JMenuItem("Coronitas");
		mnOrtodoncia.add(mntmCoronitas);
		
		JMenuItem mntmMatrices = new JMenuItem("Matrices");
		mnOrtodoncia.add(mntmMatrices);
		
		JMenuItem mntmAbreBocas = new JMenuItem("Abre bocas");
		mnOrtodoncia.add(mntmAbreBocas);
		
		JMenuItem mntmFreseros = new JMenuItem("Freseros");
		mnOrtodoncia.add(mntmFreseros);
		
		JMenuItem mntmLentes = new JMenuItem("Lentes");
		mnOrtodoncia.add(mntmLentes);
		
		JMenuItem mntmDientes = new JMenuItem("Dientes");
		mnOrtodoncia.add(mntmDientes);
		
		JMenuItem mntmCubetas = new JMenuItem("Cubetas");
		mnOrtodoncia.add(mntmCubetas);
		
		JMenuItem mntmVarios_11 = new JMenuItem("Varios");
		mnOrtodoncia.add(mntmVarios_11);
		
		JMenu mnImplantes = new JMenu("Implantes");
		menuBar.add(mnImplantes);
		
		JMenuItem mntmLigaduras = new JMenuItem("Ligaduras");
		mnImplantes.add(mntmLigaduras);
		
		JMenuItem mntmResortes = new JMenuItem("Resortes");
		mnImplantes.add(mntmResortes);
		
		JMenuItem mntmSeparadores = new JMenuItem("Separadores");
		mnImplantes.add(mntmSeparadores);
		
		JMenuItem mntmArcos = new JMenuItem("Arcos");
		mnImplantes.add(mntmArcos);
		
		JMenuItem mntmBrackets = new JMenuItem("Brackets");
		mnImplantes.add(mntmBrackets);
		
		JMenuItem mntmAlicatespinzas = new JMenuItem("Alicates/Pinzas");
		mnImplantes.add(mntmAlicatespinzas);
		
		JMenuItem mntmBotones = new JMenuItem("Botones");
		mnImplantes.add(mntmBotones);
		
		JMenuItem mntmZcalos = new JMenuItem("Z\u00F3calos");
		mnImplantes.add(mntmZcalos);
		
		JMenuItem mntmSoldaduras = new JMenuItem("Soldaduras");
		mnImplantes.add(mntmSoldaduras);
		
		JMenuItem mntmTubos = new JMenuItem("Tubos");
		mnImplantes.add(mntmTubos);
		
		JMenuItem mntmAlambres = new JMenuItem("Alambres");
		mnImplantes.add(mntmAlambres);
		
		JMenuItem mntmBandas = new JMenuItem("Bandas");
		mnImplantes.add(mntmBandas);
		
		JMenuItem mntmTornillos = new JMenuItem("Tornillos");
		mnImplantes.add(mntmTornillos);
		
		JMenu mnVarios = new JMenu("Varios");
		menuBar.add(mnVarios);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
}
