package com.forsale.app.features.categories.home.propertyhome.interactors;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import okhttp3.internal.ws.WebSocketProtocol;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RecommendedSectionsInterActor.kt */
@d(c = "com.forsale.app.features.categories.home.propertyhome.interactors.RecommendedSectionsInterActor", f = "RecommendedSectionsInterActor.kt", l = {124, WebSocketProtocol.PAYLOAD_SHORT}, m = "handleAttributes")
/* loaded from: classes2.dex */
public final class RecommendedSectionsInterActor$handleAttributes$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f25060a;

    /* renamed from: b  reason: collision with root package name */
    Object f25061b;

    /* renamed from: c  reason: collision with root package name */
    Object f25062c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f25063d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ RecommendedSectionsInterActor f25064e;

    /* renamed from: f  reason: collision with root package name */
    int f25065f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecommendedSectionsInterActor$handleAttributes$1(RecommendedSectionsInterActor recommendedSectionsInterActor, a<? super RecommendedSectionsInterActor$handleAttributes$1> aVar) {
        super(aVar);
        this.f25064e = recommendedSectionsInterActor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object w11;
        this.f25063d = obj;
        this.f25065f |= Integer.MIN_VALUE;
        w11 = this.f25064e.w(null, this);
        return w11;
    }
}
