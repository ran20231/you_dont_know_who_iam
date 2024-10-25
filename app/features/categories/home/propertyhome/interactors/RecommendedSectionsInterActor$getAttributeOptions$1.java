package com.forsale.app.features.categories.home.propertyhome.interactors;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RecommendedSectionsInterActor.kt */
@d(c = "com.forsale.app.features.categories.home.propertyhome.interactors.RecommendedSectionsInterActor", f = "RecommendedSectionsInterActor.kt", l = {149}, m = "getAttributeOptions")
/* loaded from: classes2.dex */
public final class RecommendedSectionsInterActor$getAttributeOptions$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f25045a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ RecommendedSectionsInterActor f25046b;

    /* renamed from: c  reason: collision with root package name */
    int f25047c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecommendedSectionsInterActor$getAttributeOptions$1(RecommendedSectionsInterActor recommendedSectionsInterActor, a<? super RecommendedSectionsInterActor$getAttributeOptions$1> aVar) {
        super(aVar);
        this.f25046b = recommendedSectionsInterActor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object j11;
        this.f25045a = obj;
        this.f25047c |= Integer.MIN_VALUE;
        j11 = this.f25046b.j(null, this);
        return j11;
    }
}
