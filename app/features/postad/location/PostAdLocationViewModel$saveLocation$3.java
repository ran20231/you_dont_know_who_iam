package com.forsale.app.features.postad.location;

import com.forsale.app.datalayer.network.entities.ListingDetailsEntity;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdLocationViewModel.kt */
@d(c = "com.forsale.app.features.postad.location.PostAdLocationViewModel$saveLocation$3", f = "PostAdLocationViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdLocationViewModel$saveLocation$3 extends SuspendLambda implements p<ListingDetailsEntity, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f35756a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f35757b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ PostAdLocationViewModel f35758c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdLocationViewModel$saveLocation$3(PostAdLocationViewModel postAdLocationViewModel, zz.a<? super PostAdLocationViewModel$saveLocation$3> aVar) {
        super(2, aVar);
        this.f35758c = postAdLocationViewModel;
    }

    @Override // g00.p
    /* renamed from: b */
    public final Object invoke(ListingDetailsEntity listingDetailsEntity, zz.a<? super wz.p> aVar) {
        return ((PostAdLocationViewModel$saveLocation$3) create(listingDetailsEntity, aVar)).invokeSuspend(wz.p.f75480a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        PostAdLocationViewModel$saveLocation$3 postAdLocationViewModel$saveLocation$3 = new PostAdLocationViewModel$saveLocation$3(this.f35758c, aVar);
        postAdLocationViewModel$saveLocation$3.f35757b = obj;
        return postAdLocationViewModel$saveLocation$3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
        if (r0.getValue() != 0) goto L83;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.location.PostAdLocationViewModel$saveLocation$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
