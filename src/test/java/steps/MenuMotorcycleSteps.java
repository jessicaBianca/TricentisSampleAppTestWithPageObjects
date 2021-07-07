package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import objects.MotorcycleObject;

public class MenuMotorcycleSteps {
	
	MotorcycleObject pageMotorcycle = new MotorcycleObject();
	
	@Before
	public void setup() {
	   pageMotorcycle.initialSetupChrome();
	}

	@Dado("que estou na inicial do site da tricentis")
	public void que_estou_na_inicial_do_site_da_tricentis() {
	   pageMotorcycle.getTricentis();
	}
	
	@Quando("acesso o menu Motorcycle")
	public void acesso_o_menu_motorcycle() {
	  pageMotorcycle.getMenuMotorcycle();
	}

	@E("seleciono Make e Model")
	public void seleciono_make_e_model() {
	    pageMotorcycle.setMake();
	    pageMotorcycle.setModel();
	}
	
	@E("preencho CylinderCapacity, enginePerformance, DateOfManufacture")
	public void preencho_cylinder_capacity_engine_performance_date_of_manufacture() {
		pageMotorcycle.setCylinderCapacity();
		pageMotorcycle.setEnginePerformance();
		pageMotorcycle.setDateOfManufacture();
	}
	
	@E("seleciono NumberOfSeats")
	public void seleciono_number_of_seats() {
		pageMotorcycle.setNumberOfSeats();
	}
	
	@Quando("preencho ListPrice, AnnualMillage no primeiro submenu enter vehicle data")
	public void preencho_list_price_annual_millage_no_primeiro_submenu_enter_vehicle_data() {
	   pageMotorcycle.setListPrice();
	   pageMotorcycle.setAnnualMileage();
	}
	
	@Então("devo clicar em Next ao final do formulário e validar se mudei para a página enter insurant data")
	public void devo_clicar_em_next_ao_final_do_formulário_e_validar_se_mudei_para_a_página_enter_insurant_data() {
	    pageMotorcycle.clickBtnNext();
	    pageMotorcycle.validation();
	}
	
	@After
	public void exit() {
		pageMotorcycle.exitPage();
	}


}
