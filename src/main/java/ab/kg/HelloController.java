package ab.kg;

import ab.kg.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.util.List;

@Controller
@RequestMapping("/")
public class HelloController {
	static {
		ApiContextInitializer.init();
		// Instantiate Telegram Bots API
		TelegramBotsApi botsApi = new TelegramBotsApi();
		Bot bot = new Bot();
		try {
			botsApi.registerBot(bot);
		} catch (TelegramApiException e) {
			e.printStackTrace();
		}
	}
	@Autowired
	MyService service;
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		service.save();
		List l = service.getAllEntities();
		model.addAttribute("message", l);
		return "hello";
	}
}