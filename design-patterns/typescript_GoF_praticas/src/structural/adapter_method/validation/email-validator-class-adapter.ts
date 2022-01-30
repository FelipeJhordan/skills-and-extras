import isEmail from 'validator/lib/isEmail';
import { EmailValidatorProtocol } from './email-validor-protocol';

export class EmailValidatorClassAdapter implements EmailValidatorProtocol {
  isEmail(value: string): boolean {
    return isEmail(value);
  }
}
