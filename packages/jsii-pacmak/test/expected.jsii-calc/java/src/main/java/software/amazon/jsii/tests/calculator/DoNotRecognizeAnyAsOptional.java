package software.amazon.jsii.tests.calculator;

/**
 * jsii#284: do not recognize "any" as an optional argument.
 * <p>
 * EXPERIMENTAL
 */
@javax.annotation.Generated(value = "jsii-pacmak")
@software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
@software.amazon.jsii.Jsii(module = software.amazon.jsii.tests.calculator.$Module.class, fqn = "jsii-calc.DoNotRecognizeAnyAsOptional")
public class DoNotRecognizeAnyAsOptional extends software.amazon.jsii.JsiiObject {

    protected DoNotRecognizeAnyAsOptional(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DoNotRecognizeAnyAsOptional(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public DoNotRecognizeAnyAsOptional() {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this);
    }

    /**
     * EXPERIMENTAL
     * <p>
     * @param _requiredAny This parameter is required.
     * @param _optionalAny
     * @param _optionalString
     */
    @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
    public void method(final java.lang.Object _requiredAny, final java.lang.Object _optionalAny, final java.lang.String _optionalString) {
        this.jsiiCall("method", Void.class, new Object[] { _requiredAny, _optionalAny, _optionalString });
    }

    /**
     * EXPERIMENTAL
     * <p>
     * @param _requiredAny This parameter is required.
     * @param _optionalAny
     */
    @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
    public void method(final java.lang.Object _requiredAny, final java.lang.Object _optionalAny) {
        this.jsiiCall("method", Void.class, new Object[] { _requiredAny, _optionalAny });
    }

    /**
     * EXPERIMENTAL
     * <p>
     * @param _requiredAny This parameter is required.
     */
    @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
    public void method(final java.lang.Object _requiredAny) {
        this.jsiiCall("method", Void.class, new Object[] { _requiredAny });
    }
}
