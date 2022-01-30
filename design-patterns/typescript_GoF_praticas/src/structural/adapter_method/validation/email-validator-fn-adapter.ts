import isEmail from 'validator/lib/isEmail';
import { EmailValidatorFnProtocol } from './email-validor-protocol';

export const emailValidatoFnAdapter: EmailValidatorFnProtocol = (
  value: string,
): boolean => {
  return isEmail(value);
};
