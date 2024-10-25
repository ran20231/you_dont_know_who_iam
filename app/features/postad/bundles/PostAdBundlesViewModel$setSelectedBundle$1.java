package com.forsale.app.features.postad.bundles;

import com.forsale.app.datalayer.network.entities.AddonsRequested;
import com.forsale.app.datalayer.network.entities.ListingDetailsEntity;
import com.forsale.app.datalayer.network.responses.Addon;
import com.forsale.app.datalayer.network.responses.Bundle;
import g00.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.r;
import kotlin.collections.s;
import kotlin.coroutines.jvm.internal.SuspendLambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdBundlesViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.bundles.PostAdBundlesViewModel$setSelectedBundle$1", f = "PostAdBundlesViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdBundlesViewModel$setSelectedBundle$1 extends SuspendLambda implements p<ListingDetailsEntity, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f35056a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f35057b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Bundle f35058c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ PostAdBundlesViewModel f35059d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdBundlesViewModel$setSelectedBundle$1(Bundle bundle, PostAdBundlesViewModel postAdBundlesViewModel, zz.a<? super PostAdBundlesViewModel$setSelectedBundle$1> aVar) {
        super(2, aVar);
        this.f35058c = bundle;
        this.f35059d = postAdBundlesViewModel;
    }

    @Override // g00.p
    /* renamed from: b */
    public final Object invoke(ListingDetailsEntity listingDetailsEntity, zz.a<? super wz.p> aVar) {
        return ((PostAdBundlesViewModel$setSelectedBundle$1) create(listingDetailsEntity, aVar)).invokeSuspend(wz.p.f75480a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        PostAdBundlesViewModel$setSelectedBundle$1 postAdBundlesViewModel$setSelectedBundle$1 = new PostAdBundlesViewModel$setSelectedBundle$1(this.f35058c, this.f35059d, aVar);
        postAdBundlesViewModel$setSelectedBundle$1.f35057b = obj;
        return postAdBundlesViewModel$setSelectedBundle$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Integer num;
        List<AddonsRequested> n11;
        List<Addon> addons;
        int y11;
        kotlin.coroutines.intrinsics.b.f();
        if (this.f35056a == 0) {
            kotlin.f.b(obj);
            ListingDetailsEntity listingDetailsEntity = (ListingDetailsEntity) this.f35057b;
            listingDetailsEntity.setBundle(this.f35058c);
            Bundle bundle = this.f35058c;
            if (bundle != null) {
                num = kotlin.coroutines.jvm.internal.a.d(bundle.getId());
            } else {
                num = null;
            }
            listingDetailsEntity.setPlanId(num);
            Bundle bundle2 = this.f35058c;
            if (bundle2 == null || (addons = bundle2.getAddons()) == null) {
                n11 = r.n();
            } else {
                List<Addon> list = addons;
                y11 = s.y(list, 10);
                n11 = new ArrayList<>(y11);
                for (Addon addon : list) {
                    addon.setIncludedInBundle(true);
                    n11.add(AddonsRequested.Companion.createFrom(addon));
                }
            }
            listingDetailsEntity.setAddonsRequested(n11);
            Bundle bundle3 = this.f35058c;
            if (bundle3 != null) {
                this.f35059d.L(listingDetailsEntity, bundle3.getNextPage());
            }
            return wz.p.f75480a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
