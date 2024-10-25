package com.forsale.app.features.postad;

import com.forsale.app.datalayer.network.entities.ListingDetailsEntity;
import com.forsale.app.datalayer.repositories.ListingDetailsEntityRepository;
import g00.p;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.PostAdViewModel$updateCache$1$1", f = "PostAdViewModel.kt", l = {1357, 1358}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdViewModel$updateCache$1$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f34171a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ListingDetailsEntity f34172b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ PostAdViewModel f34173c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdViewModel$updateCache$1$1(ListingDetailsEntity listingDetailsEntity, PostAdViewModel postAdViewModel, zz.a<? super PostAdViewModel$updateCache$1$1> aVar) {
        super(2, aVar);
        this.f34172b = listingDetailsEntity;
        this.f34173c = postAdViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PostAdViewModel$updateCache$1$1(this.f34172b, this.f34173c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        String str;
        ListingDetailsEntityRepository listingDetailsEntityRepository;
        MutableSharedFlow mutableSharedFlow;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f34171a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    kotlin.f.b(obj);
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        } else {
            kotlin.f.b(obj);
            List<String> images = this.f34172b.getImages();
            if (images != null) {
                str = CollectionsKt___CollectionsKt.t0(images, ",", null, null, 0, null, null, 62, null);
            } else {
                str = null;
            }
            x10.a.b("UPLOAD_MEDIA:: updateCache " + str, new Object[0]);
            listingDetailsEntityRepository = this.f34173c.f33961r0;
            ListingDetailsEntity listingDetailsEntity = this.f34172b;
            this.f34171a = 1;
            obj = listingDetailsEntityRepository.insertOrUpdate(listingDetailsEntity, this);
            if (obj == f11) {
                return f11;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            mutableSharedFlow = this.f34173c.f33971v1;
            wz.p pVar = wz.p.f75480a;
            this.f34171a = 2;
            if (mutableSharedFlow.emit(pVar, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdViewModel$updateCache$1$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
