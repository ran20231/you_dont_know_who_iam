package com.forsale.app.base.activities;

import android.content.Context;
import com.forsale.app.utils.languageutils.LanguageContextWrapper;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineScope;
import l8.a;
/* compiled from: BasePlainActivity.kt */
@d(c = "com.forsale.app.base.activities.BasePlainActivity$createConfigurationContext$1", f = "BasePlainActivity.kt", l = {a.f62267d}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class BasePlainActivity$createConfigurationContext$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super LanguageContextWrapper>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f22052a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f22053b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasePlainActivity$createConfigurationContext$1(Context context, zz.a<? super BasePlainActivity$createConfigurationContext$1> aVar) {
        super(2, aVar);
        this.f22053b = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new BasePlainActivity$createConfigurationContext$1(this.f22053b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f22052a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            LanguageContextWrapper.Companion companion = LanguageContextWrapper.f40333a;
            Context context = this.f22053b;
            o.f(context);
            this.f22052a = 1;
            obj = LanguageContextWrapper.Companion.b(companion, context, null, this, 2, null);
            if (obj == f11) {
                return f11;
            }
        }
        return obj;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super LanguageContextWrapper> aVar) {
        return ((BasePlainActivity$createConfigurationContext$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
