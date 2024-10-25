package com.forsale.app.utils.facades;

import android.content.Context;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import g00.p;
import java.util.List;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineScope;
import zendesk.configurations.Configuration;
import zendesk.support.request.RequestActivity;
import zendesk.support.request.RequestConfiguration;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ZendeskSupport.kt */
@d(c = "com.forsale.app.utils.facades.ZendeskSupport$createTicket$1", f = "ZendeskSupport.kt", l = {FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ZendeskSupport$createTicket$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f40126a;

    /* renamed from: b  reason: collision with root package name */
    int f40127b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ZendeskSupport f40128c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Context f40129d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZendeskSupport$createTicket$1(ZendeskSupport zendeskSupport, Context context, a<? super ZendeskSupport$createTicket$1> aVar) {
        super(2, aVar);
        this.f40128c = zendeskSupport;
        this.f40129d = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new ZendeskSupport$createTicket$1(this.f40128c, this.f40129d, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        Object j11;
        RequestConfiguration.Builder builder;
        f11 = b.f();
        int i11 = this.f40127b;
        if (i11 != 0) {
            if (i11 == 1) {
                builder = (RequestConfiguration.Builder) this.f40126a;
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            RequestConfiguration.Builder builder2 = RequestActivity.builder();
            ZendeskSupport zendeskSupport = this.f40128c;
            this.f40126a = builder2;
            this.f40127b = 1;
            j11 = zendeskSupport.j(this);
            if (j11 == f11) {
                return f11;
            }
            builder = builder2;
            obj = j11;
        }
        Configuration config = builder.withCustomFields((List) obj).config();
        o.h(config, "config(...)");
        RequestActivity.builder().show(this.f40129d, config);
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((ZendeskSupport$createTicket$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
