package com.forsale.app.datalayer.network.errorhandling.errorserializer;

import com.forsale.app.datalayer.network.entities.errors.AuthErrorModel;
import com.forsale.app.datalayer.network.entities.errors.AuthErrorModelKt;
import com.forsale.app.datalayer.network.errorhandling.NetworkErrorModel;
import com.google.gson.JsonSyntaxException;
import com.google.gson.d;
import dj.i;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
/* compiled from: AuthErrorSerializer.kt */
/* loaded from: classes2.dex */
public final class AuthErrorSerializer implements ErrorModelSerializer {
    public static final int $stable = 8;
    private final d gson;

    public AuthErrorSerializer(d gson) {
        o.i(gson, "gson");
        this.gson = gson;
    }

    @Override // com.forsale.app.datalayer.network.errorhandling.errorserializer.ErrorModelSerializer
    public NetworkErrorModel serialize(int i11, String str) {
        try {
            Object k11 = this.gson.k(str, AuthErrorModel.class);
            o.h(k11, "fromJson(...)");
            return AuthErrorModelKt.toNetworkErrorModel((AuthErrorModel) k11, i11);
        } catch (JsonSyntaxException unused) {
            i invoke = i.f54287a.invoke();
            String i12 = s.b(AuthErrorModel.class).i();
            invoke.c("Deserialization to model " + i12 + " failed");
            return null;
        }
    }
}
