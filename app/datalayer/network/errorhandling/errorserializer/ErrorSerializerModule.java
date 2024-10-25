package com.forsale.app.datalayer.network.errorhandling.errorserializer;
/* compiled from: ErrorSerializerModule.kt */
/* loaded from: classes2.dex */
public abstract class ErrorSerializerModule {
    public static final int $stable = 0;

    @AuthSerializer
    public abstract ErrorModelSerializer provideAuthErrorSerializer(AuthErrorSerializer authErrorSerializer);

    @ValidationSerializer
    public abstract ErrorModelSerializer provideGeneralErrorSerializer(ValidationErrorSerializer validationErrorSerializer);
}
