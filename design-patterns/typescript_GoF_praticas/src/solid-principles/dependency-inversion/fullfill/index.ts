interface IEmailService {
  enviarEmail(): void;
}

class InserirUsuarioController extends BaseController {

  private emailService: IEmailService; // <- abstração
  constructor(emailService: IEmailService) { // <- abstração
    this.emailService = emailService;
  }

  protected enviarEmail(): void {
    // envia mail
    const email = new Email(...)
    this.emailService.sendMail(email);
  }
}
