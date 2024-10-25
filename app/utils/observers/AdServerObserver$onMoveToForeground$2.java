package com.forsale.app.utils.observers;

import android.content.Context;
import com.forsale.adserver.utils.viewsUtils.UtilsKt;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: AdServerObserver.kt */
@d(c = "com.forsale.app.utils.observers.AdServerObserver$onMoveToForeground$2", f = "AdServerObserver.kt", l = {36}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AdServerObserver$onMoveToForeground$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f40378a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AdServerObserver f40379b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdServerObserver$onMoveToForeground$2(AdServerObserver adServerObserver, zz.a<? super AdServerObserver$onMoveToForeground$2> aVar) {
        super(2, aVar);
        this.f40379b = adServerObserver;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new AdServerObserver$onMoveToForeground$2(this.f40379b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        Context context;
        f11 = b.f();
        int i11 = this.f40378a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            x10.a.b("Downloading ADserver from AdServer observer", new Object[0]);
            context = this.f40379b.f40375a;
            this.f40378a = 1;
            if (UtilsKt.a(context, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((AdServerObserver$onMoveToForeground$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
