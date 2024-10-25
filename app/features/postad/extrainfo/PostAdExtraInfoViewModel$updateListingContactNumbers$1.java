package com.forsale.app.features.postad.extrainfo;

import com.forsale.app.datalayer.network.entities.ListingDetailsEntity;
import com.forsale.app.features.postad.PostAdViewModel;
import g00.p;
import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdExtraInfoViewModel.kt */
@d(c = "com.forsale.app.features.postad.extrainfo.PostAdExtraInfoViewModel$updateListingContactNumbers$1", f = "PostAdExtraInfoViewModel.kt", l = {306}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdExtraInfoViewModel$updateListingContactNumbers$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f35554a;

    /* renamed from: b  reason: collision with root package name */
    Object f35555b;

    /* renamed from: c  reason: collision with root package name */
    Object f35556c;

    /* renamed from: d  reason: collision with root package name */
    int f35557d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ PostAdExtraInfoViewModel f35558e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdExtraInfoViewModel$updateListingContactNumbers$1(PostAdExtraInfoViewModel postAdExtraInfoViewModel, zz.a<? super PostAdExtraInfoViewModel$updateListingContactNumbers$1> aVar) {
        super(2, aVar);
        this.f35558e = postAdExtraInfoViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PostAdExtraInfoViewModel$updateListingContactNumbers$1(this.f35558e, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        ListingDetailsEntity listingDetailsEntity;
        PostAdExtraInfoViewModel postAdExtraInfoViewModel;
        ListingDetailsEntity listingDetailsEntity2;
        String str;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f35557d;
        if (i11 != 0) {
            if (i11 == 1) {
                listingDetailsEntity = (ListingDetailsEntity) this.f35556c;
                listingDetailsEntity2 = (ListingDetailsEntity) this.f35555b;
                postAdExtraInfoViewModel = (PostAdExtraInfoViewModel) this.f35554a;
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            ListingDetailsEntity n22 = this.f35558e.o1().n2();
            if (n22 != null) {
                PostAdExtraInfoViewModel postAdExtraInfoViewModel2 = this.f35558e;
                PostAdViewModel o12 = postAdExtraInfoViewModel2.o1();
                this.f35554a = postAdExtraInfoViewModel2;
                this.f35555b = n22;
                this.f35556c = n22;
                this.f35557d = 1;
                Object U1 = o12.U1(this);
                if (U1 == f11) {
                    return f11;
                }
                listingDetailsEntity = n22;
                obj = U1;
                postAdExtraInfoViewModel = postAdExtraInfoViewModel2;
                listingDetailsEntity2 = listingDetailsEntity;
            }
            return wz.p.f75480a;
        }
        Set set = (Set) obj;
        if (set != null) {
            str = CollectionsKt___CollectionsKt.t0(set, ",", null, null, 0, null, null, 62, null);
        } else {
            str = null;
        }
        listingDetailsEntity.setContactNo(str);
        postAdExtraInfoViewModel.o1().L4(listingDetailsEntity2);
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdExtraInfoViewModel$updateListingContactNumbers$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
