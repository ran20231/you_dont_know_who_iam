package com.forsale.app.features.postad.addons.featured;

import com.forsale.app.datalayer.network.entities.ListingDetailsEntity;
import com.forsale.app.datalayer.network.responses.AddonsGroup;
import g00.p;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import wz.i;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FeaturedAddonItemViewModel.kt */
@d(c = "com.forsale.app.features.postad.addons.featured.FeaturedAddonItemViewModel$openSelector$1", f = "FeaturedAddonItemViewModel.kt", l = {77}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class FeaturedAddonItemViewModel$openSelector$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f34728a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ FeaturedAddonItemViewModel f34729b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeaturedAddonItemViewModel$openSelector$1(FeaturedAddonItemViewModel featuredAddonItemViewModel, a<? super FeaturedAddonItemViewModel$openSelector$1> aVar) {
        super(2, aVar);
        this.f34729b = featuredAddonItemViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new FeaturedAddonItemViewModel$openSelector$1(this.f34729b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableSharedFlow mutableSharedFlow;
        AddonsGroup addonsGroup;
        ListingDetailsEntity listingDetailsEntity;
        f11 = b.f();
        int i11 = this.f34728a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            mutableSharedFlow = this.f34729b.f34722q;
            addonsGroup = this.f34729b.f34707b;
            listingDetailsEntity = this.f34729b.f34708c;
            Pair a11 = i.a(addonsGroup, listingDetailsEntity);
            this.f34728a = 1;
            if (mutableSharedFlow.emit(a11, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((FeaturedAddonItemViewModel$openSelector$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
