package com.forsale.app.features.postad.addons.featured;

import com.forsale.app.datalayer.database.CategoryRuleSet;
import com.forsale.app.datalayer.network.entities.ListingDetailsEntity;
import com.forsale.app.datalayer.network.responses.AddonsGroup;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FeaturedAddonItemViewModel.kt */
@d(c = "com.forsale.app.features.postad.addons.featured.FeaturedAddonItemViewModel$onClick$1", f = "FeaturedAddonItemViewModel.kt", l = {68}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class FeaturedAddonItemViewModel$onClick$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f34726a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ FeaturedAddonItemViewModel f34727b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeaturedAddonItemViewModel$onClick$1(FeaturedAddonItemViewModel featuredAddonItemViewModel, a<? super FeaturedAddonItemViewModel$onClick$1> aVar) {
        super(2, aVar);
        this.f34727b = featuredAddonItemViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new FeaturedAddonItemViewModel$onClick$1(this.f34727b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        CategoryRuleSet.RuleSet ruleSet;
        AddonsGroup addonsGroup;
        ListingDetailsEntity listingDetailsEntity;
        MutableSharedFlow mutableSharedFlow;
        f11 = b.f();
        int i11 = this.f34726a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            ruleSet = this.f34727b.f34711f;
            CategoryRuleSet.MediaConfiguration media = ruleSet.getMedia();
            boolean z11 = false;
            if (media != null && media.getEnabled()) {
                z11 = true;
            }
            if (z11) {
                addonsGroup = this.f34727b.f34707b;
                if (addonsGroup.isMediaRequired()) {
                    listingDetailsEntity = this.f34727b.f34708c;
                    if (!listingDetailsEntity.getHasMedia()) {
                        mutableSharedFlow = this.f34727b.f34724s;
                        wz.p pVar = wz.p.f75480a;
                        this.f34726a = 1;
                        if (mutableSharedFlow.emit(pVar, this) == f11) {
                            return f11;
                        }
                    }
                }
            }
            this.f34727b.u();
            return wz.p.f75480a;
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((FeaturedAddonItemViewModel$onClick$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
