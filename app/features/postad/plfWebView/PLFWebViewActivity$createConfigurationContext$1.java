package com.forsale.app.features.postad.plfWebView;

import android.content.Context;
import com.forsale.app.utils.languageutils.LanguageContextWrapper;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: PLFWebViewActivity.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.plfWebView.PLFWebViewActivity$createConfigurationContext$1", f = "PLFWebViewActivity.kt", l = {77}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PLFWebViewActivity$createConfigurationContext$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super LanguageContextWrapper>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f36435a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f36436b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PLFWebViewActivity$createConfigurationContext$1(Context context, zz.a<? super PLFWebViewActivity$createConfigurationContext$1> aVar) {
        super(2, aVar);
        this.f36436b = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PLFWebViewActivity$createConfigurationContext$1(this.f36436b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f36435a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            LanguageContextWrapper.Companion companion = LanguageContextWrapper.f40333a;
            Context context = this.f36436b;
            o.f(context);
            this.f36435a = 1;
            obj = LanguageContextWrapper.Companion.b(companion, context, null, this, 2, null);
            if (obj == f11) {
                return f11;
            }
        }
        return obj;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super LanguageContextWrapper> aVar) {
        return ((PLFWebViewActivity$createConfigurationContext$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
