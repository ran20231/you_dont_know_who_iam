package com.forsale.app.features.categories.home.propertyhome.interactors;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RecommendedSectionsInterActor.kt */
@d(c = "com.forsale.app.features.categories.home.propertyhome.interactors.RecommendedSectionsInterActor", f = "RecommendedSectionsInterActor.kt", l = {61, 67}, m = "getTitleTrailing")
/* loaded from: classes2.dex */
public final class RecommendedSectionsInterActor$getTitleTrailing$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f25052a;

    /* renamed from: b  reason: collision with root package name */
    Object f25053b;

    /* renamed from: c  reason: collision with root package name */
    Object f25054c;

    /* renamed from: d  reason: collision with root package name */
    Object f25055d;

    /* renamed from: e  reason: collision with root package name */
    Object f25056e;

    /* renamed from: f  reason: collision with root package name */
    /* synthetic */ Object f25057f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ RecommendedSectionsInterActor f25058g;

    /* renamed from: h  reason: collision with root package name */
    int f25059h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecommendedSectionsInterActor$getTitleTrailing$1(RecommendedSectionsInterActor recommendedSectionsInterActor, a<? super RecommendedSectionsInterActor$getTitleTrailing$1> aVar) {
        super(aVar);
        this.f25058g = recommendedSectionsInterActor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25057f = obj;
        this.f25059h |= Integer.MIN_VALUE;
        return this.f25058g.v(null, this);
    }
}
