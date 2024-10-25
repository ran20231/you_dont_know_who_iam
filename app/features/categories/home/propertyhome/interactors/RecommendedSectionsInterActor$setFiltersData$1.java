package com.forsale.app.features.categories.home.propertyhome.interactors;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RecommendedSectionsInterActor.kt */
@d(c = "com.forsale.app.features.categories.home.propertyhome.interactors.RecommendedSectionsInterActor", f = "RecommendedSectionsInterActor.kt", l = {45, 47, 48}, m = "setFiltersData")
/* loaded from: classes2.dex */
public final class RecommendedSectionsInterActor$setFiltersData$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f25066a;

    /* renamed from: b  reason: collision with root package name */
    Object f25067b;

    /* renamed from: c  reason: collision with root package name */
    Object f25068c;

    /* renamed from: d  reason: collision with root package name */
    Object f25069d;

    /* renamed from: e  reason: collision with root package name */
    /* synthetic */ Object f25070e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ RecommendedSectionsInterActor f25071f;

    /* renamed from: g  reason: collision with root package name */
    int f25072g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecommendedSectionsInterActor$setFiltersData$1(RecommendedSectionsInterActor recommendedSectionsInterActor, a<? super RecommendedSectionsInterActor$setFiltersData$1> aVar) {
        super(aVar);
        this.f25071f = recommendedSectionsInterActor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25070e = obj;
        this.f25072g |= Integer.MIN_VALUE;
        return this.f25071f.y(null, null, this);
    }
}
