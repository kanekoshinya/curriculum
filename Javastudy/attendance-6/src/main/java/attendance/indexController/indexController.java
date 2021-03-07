package attendance.indexController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import attendance.SampleForm;



@Controller
@RequestMapping("/")
public class indexController {
	@GetMapping
	public String index(Model model) {
		  SampleForm sampleForm = new SampleForm();
		  sampleForm.setInput("This is input value");
		  sampleForm.setCheckbox1(true);
		  sampleForm.setCheckbox2(false);
		  sampleForm.setRadio(3);
		  int[] selectValues = {0, 1, 2, 3, 4,5};
		  model.addAttribute("selectValues", selectValues);

		  model.addAttribute("sampleForm", sampleForm);
		  return "index";
	}
}
