package com.forsale.app.features.auth;

import android.content.Context;
import com.forsale.app.utils.Languages;
import com.forsale.app.utils.languageutils.LanguageContextWrapper;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: AuthActivity.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.auth.AuthActivity$ScreenContent$1", f = "AuthActivity.kt", l = {42}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class AuthActivity$ScreenContent$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f22471a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f22472b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthActivity$ScreenContent$1(Context context, zz.a<? super AuthActivity$ScreenContent$1> aVar) {
        super(2, aVar);
        this.f22472b = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new AuthActivity$ScreenContent$1(this.f22472b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f22471a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            LanguageContextWrapper.Companion companion = LanguageContextWrapper.f40333a;
            Context context = this.f22472b;
            String value = Languages.Companion.b().getValue();
            this.f22471a = 1;
            if (companion.a(context, value, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((AuthActivity$ScreenContent$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
