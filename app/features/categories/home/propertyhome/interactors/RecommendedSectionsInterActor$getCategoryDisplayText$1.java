package com.forsale.app.features.categories.home.propertyhome.interactors;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RecommendedSectionsInterActor.kt */
@d(c = "com.forsale.app.features.categories.home.propertyhome.interactors.RecommendedSectionsInterActor", f = "RecommendedSectionsInterActor.kt", l = {186}, m = "getCategoryDisplayText")
/* loaded from: classes2.dex */
public final class RecommendedSectionsInterActor$getCategoryDisplayText$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f25048a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f25049b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ RecommendedSectionsInterActor f25050c;

    /* renamed from: d  reason: collision with root package name */
    int f25051d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecommendedSectionsInterActor$getCategoryDisplayText$1(RecommendedSectionsInterActor recommendedSectionsInterActor, a<? super RecommendedSectionsInterActor$getCategoryDisplayText$1> aVar) {
        super(aVar);
        this.f25050c = recommendedSectionsInterActor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object n11;
        this.f25049b = obj;
        this.f25051d |= Integer.MIN_VALUE;
        n11 = this.f25050c.n(null, this);
        return n11;
    }
}
