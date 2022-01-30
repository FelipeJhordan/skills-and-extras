import { emailValidatoFnAdapter } from './validation/email-validator-fn-adapter';
import { EmailValidatorClassAdapter } from './validation/email-validator-class-adapter';
import {
  EmailValidatorFnProtocol,
  EmailValidatorProtocol,
} from './validation/email-validor-protocol';

function validaEmailClass(
  emailValidator: EmailValidatorProtocol,
  email: string,
): void {
  if (emailValidator.isEmail(email)) {
    console.log('Email é válido');
  } else {
    console.log('Email é inválido');
  }
}

function validaEmailFunction(
  isEmail: EmailValidatorFnProtocol,
  email: string,
): void {
  if (isEmail(email)) {
    console.log('Email é válido');
  } else {
    console.log('Email é inválido');
  }
}

validaEmailClass(new EmailValidatorClassAdapter(), 'Felipe@hero.com');
validaEmailFunction(emailValidatoFnAdapter, 'Felipe@hero.com');
