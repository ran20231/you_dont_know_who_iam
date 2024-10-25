package com.forsale.app.utils.facades;

import android.content.Context;
import g00.p;
import java.util.List;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineScope;
import l8.a;
import zendesk.configurations.Configuration;
import zendesk.support.guide.HelpCenterActivity;
import zendesk.support.request.RequestActivity;
import zendesk.support.request.RequestConfiguration;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ZendeskSupport.kt */
@d(c = "com.forsale.app.utils.facades.ZendeskSupport$showFAQs$1", f = "ZendeskSupport.kt", l = {a.f62268e}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ZendeskSupport$showFAQs$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f40145a;

    /* renamed from: b  reason: collision with root package name */
    int f40146b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ZendeskSupport f40147c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Context f40148d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZendeskSupport$showFAQs$1(ZendeskSupport zendeskSupport, Context context, zz.a<? super ZendeskSupport$showFAQs$1> aVar) {
        super(2, aVar);
        this.f40147c = zendeskSupport;
        this.f40148d = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new ZendeskSupport$showFAQs$1(this.f40147c, this.f40148d, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        Object j11;
        RequestConfiguration.Builder builder;
        f11 = b.f();
        int i11 = this.f40146b;
        if (i11 != 0) {
            if (i11 == 1) {
                builder = (RequestConfiguration.Builder) this.f40145a;
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            RequestConfiguration.Builder builder2 = RequestActivity.builder();
            ZendeskSupport zendeskSupport = this.f40147c;
            this.f40145a = builder2;
            this.f40146b = 1;
            j11 = zendeskSupport.j(this);
            if (j11 == f11) {
                return f11;
            }
            builder = builder2;
            obj = j11;
        }
        Configuration config = builder.withCustomFields((List) obj).config();
        o.h(config, "config(...)");
        HelpCenterActivity.builder().show(this.f40148d, config);
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((ZendeskSupport$showFAQs$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
