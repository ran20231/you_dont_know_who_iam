package com.forsale.app.utils.facades.user;

import com.google.android.gms.common.api.CommonStatusCodes;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatInteractor.kt */
@d(c = "com.forsale.app.utils.facades.user.ChatInteractor", f = "ChatInteractor.kt", l = {CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE}, m = "initChat")
/* loaded from: classes3.dex */
public final class ChatInteractor$initChat$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f40200a;

    /* renamed from: b  reason: collision with root package name */
    Object f40201b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f40202c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ChatInteractor f40203d;

    /* renamed from: e  reason: collision with root package name */
    int f40204e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatInteractor$initChat$1(ChatInteractor chatInteractor, a<? super ChatInteractor$initChat$1> aVar) {
        super(aVar);
        this.f40203d = chatInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f40202c = obj;
        this.f40204e |= Integer.MIN_VALUE;
        return this.f40203d.b(null, null, null, this);
    }
}
