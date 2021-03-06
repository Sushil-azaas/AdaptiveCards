/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public class TextRun extends Inline {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected TextRun(long cPtr, boolean cMemoryOwn) {
    super(AdaptiveCardObjectModelJNI.TextRun_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TextRun obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void swigSetCMemOwn(boolean own) {
    swigCMemOwnDerived = own;
    super.swigSetCMemOwn(own);
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        AdaptiveCardObjectModelJNI.delete_TextRun(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public TextRun() {
    this(AdaptiveCardObjectModelJNI.new_TextRun__SWIG_0(), true);
  }

  public TextRun(TextRun arg0) {
    this(AdaptiveCardObjectModelJNI.new_TextRun__SWIG_1(TextRun.getCPtr(arg0), arg0), true);
  }

  public JsonValue SerializeToJsonValue() {
    return new JsonValue(AdaptiveCardObjectModelJNI.TextRun_SerializeToJsonValue(swigCPtr, this), true);
  }

  public static Inline Deserialize(ParseContext context, JsonValue root) {
    long cPtr = AdaptiveCardObjectModelJNI.TextRun_Deserialize(ParseContext.getCPtr(context), context, JsonValue.getCPtr(root), root);
    return (cPtr == 0) ? null : new Inline(cPtr, true);
  }

  public String GetText() {
    return AdaptiveCardObjectModelJNI.TextRun_GetText(swigCPtr, this);
  }

  public void SetText(String value) {
    AdaptiveCardObjectModelJNI.TextRun_SetText(swigCPtr, this, value);
  }

  public DateTimePreparser GetTextForDateParsing() {
    return new DateTimePreparser(AdaptiveCardObjectModelJNI.TextRun_GetTextForDateParsing(swigCPtr, this), true);
  }

  public TextSize GetTextSize() {
    return TextSize.swigToEnum(AdaptiveCardObjectModelJNI.TextRun_GetTextSize(swigCPtr, this));
  }

  public void SetTextSize(TextSize value) {
    AdaptiveCardObjectModelJNI.TextRun_SetTextSize(swigCPtr, this, value.swigValue());
  }

  public TextWeight GetTextWeight() {
    return TextWeight.swigToEnum(AdaptiveCardObjectModelJNI.TextRun_GetTextWeight(swigCPtr, this));
  }

  public void SetTextWeight(TextWeight value) {
    AdaptiveCardObjectModelJNI.TextRun_SetTextWeight(swigCPtr, this, value.swigValue());
  }

  public FontType GetFontType() {
    return FontType.swigToEnum(AdaptiveCardObjectModelJNI.TextRun_GetFontType(swigCPtr, this));
  }

  public void SetFontType(FontType value) {
    AdaptiveCardObjectModelJNI.TextRun_SetFontType(swigCPtr, this, value.swigValue());
  }

  public ForegroundColor GetTextColor() {
    return ForegroundColor.swigToEnum(AdaptiveCardObjectModelJNI.TextRun_GetTextColor(swigCPtr, this));
  }

  public void SetTextColor(ForegroundColor value) {
    AdaptiveCardObjectModelJNI.TextRun_SetTextColor(swigCPtr, this, value.swigValue());
  }

  public boolean GetIsSubtle() {
    return AdaptiveCardObjectModelJNI.TextRun_GetIsSubtle(swigCPtr, this);
  }

  public void SetIsSubtle(boolean value) {
    AdaptiveCardObjectModelJNI.TextRun_SetIsSubtle(swigCPtr, this, value);
  }

  public boolean GetItalic() {
    return AdaptiveCardObjectModelJNI.TextRun_GetItalic(swigCPtr, this);
  }

  public void SetItalic(boolean value) {
    AdaptiveCardObjectModelJNI.TextRun_SetItalic(swigCPtr, this, value);
  }

  public boolean GetStrikethrough() {
    return AdaptiveCardObjectModelJNI.TextRun_GetStrikethrough(swigCPtr, this);
  }

  public void SetStrikethrough(boolean value) {
    AdaptiveCardObjectModelJNI.TextRun_SetStrikethrough(swigCPtr, this, value);
  }

  public boolean GetHighlight() {
    return AdaptiveCardObjectModelJNI.TextRun_GetHighlight(swigCPtr, this);
  }

  public void SetHighlight(boolean value) {
    AdaptiveCardObjectModelJNI.TextRun_SetHighlight(swigCPtr, this, value);
  }

  public void SetLanguage(String value) {
    AdaptiveCardObjectModelJNI.TextRun_SetLanguage(swigCPtr, this, value);
  }

  public String GetLanguage() {
    return AdaptiveCardObjectModelJNI.TextRun_GetLanguage(swigCPtr, this);
  }

  public boolean GetUnderline() {
    return AdaptiveCardObjectModelJNI.TextRun_GetUnderline(swigCPtr, this);
  }

  public void SetUnderline(boolean value) {
    AdaptiveCardObjectModelJNI.TextRun_SetUnderline(swigCPtr, this, value);
  }

  public BaseActionElement GetSelectAction() {
    long cPtr = AdaptiveCardObjectModelJNI.TextRun_GetSelectAction(swigCPtr, this);
    return (cPtr == 0) ? null : new BaseActionElement(cPtr, true);
  }

  public void SetSelectAction(BaseActionElement action) {
    AdaptiveCardObjectModelJNI.TextRun_SetSelectAction(swigCPtr, this, BaseActionElement.getCPtr(action), action);
  }

  public static TextRun dynamic_cast(Inline inlineVar) {
    long cPtr = AdaptiveCardObjectModelJNI.TextRun_dynamic_cast(Inline.getCPtr(inlineVar), inlineVar);
    return (cPtr == 0) ? null : new TextRun(cPtr, true);
  }

}
