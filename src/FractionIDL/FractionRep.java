package FractionIDL;


/**
* FractionIDL/FractionRep.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from C:/Users/Mike/IdeaProjects/FractionIDL/idl/Fraction.idl
* Saturday, October 21, 2017 12:47:58 PM EDT
*/

public final class FractionRep implements org.omg.CORBA.portable.IDLEntity
{
  public long numerator = (long)0;
  public long denominator = (long)0;

  public FractionRep ()
  {
  } // ctor

  public FractionRep (long _numerator, long _denominator)
  {
    numerator = _numerator;
    denominator = _denominator;
  } // ctor

} // class FractionRep
