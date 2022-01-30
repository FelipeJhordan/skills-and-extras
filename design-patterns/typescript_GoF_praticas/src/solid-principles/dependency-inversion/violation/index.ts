import { SendGridService } from '../../services'; // <- Código Fonte da dependência

class InserirUsuarioController extends BaseController {

  private emailService: SendGridService = new SendGridService(); // <- classe concreta

  constructor() {
  }

  protected enviarEmail(): void {
    // enviar email
    const email = new Email(...)
    this.emailService.sendMail(mail);
  }
}
