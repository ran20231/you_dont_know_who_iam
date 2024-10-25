package com.forsale.adserver.datalayer.network;

import b9.g;
import f9.b;
import g00.l;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import wz.p;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WebClient.kt */
@d(c = "com.forsale.adserver.datalayer.network.WebClient$loadDataBaseInfo$2", f = "WebClient.kt", l = {243}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class WebClient$loadDataBaseInfo$2 extends SuspendLambda implements l<a<? super b>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f20724a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ WebClient f20725b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebClient$loadDataBaseInfo$2(WebClient webClient, a<? super WebClient$loadDataBaseInfo$2> aVar) {
        super(1, aVar);
        this.f20725b = webClient;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<p> create(a<?> aVar) {
        return new WebClient$loadDataBaseInfo$2(this.f20725b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        g gVar;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f20724a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            gVar = this.f20725b.f20704c;
            com.google.gson.g gVar2 = new com.google.gson.g();
            this.f20724a = 1;
            obj = gVar.c(gVar2, this);
            if (obj == f11) {
                return f11;
            }
        }
        return obj;
    }

    @Override // g00.l
    public final Object invoke(a<? super b> aVar) {
        return ((WebClient$loadDataBaseInfo$2) create(aVar)).invokeSuspend(p.f75480a);
    }
}
