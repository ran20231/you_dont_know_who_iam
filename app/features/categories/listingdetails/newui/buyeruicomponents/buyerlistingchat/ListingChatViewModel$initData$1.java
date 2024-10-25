package com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.buyerlistingchat;

import com.forsale.app.datalayer.network.responses.ListingItemBrief;
import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import com.forsale.app.datalayer.network.responses.listingdetails.ListingUser;
import com.forsale.app.features.categories.user.profile.UserProfileData;
import com.forsale.app.utils.TypeExtensionsKt;
import g00.p;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ListingChatViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.buyerlistingchat.ListingChatViewModel$initData$1", f = "ListingChatViewModel.kt", l = {73}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ListingChatViewModel$initData$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f27366a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ListingChatViewModel f27367b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListingChatViewModel$initData$1(ListingChatViewModel listingChatViewModel, zz.a<? super ListingChatViewModel$initData$1> aVar) {
        super(2, aVar);
        this.f27367b = listingChatViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new ListingChatViewModel$initData$1(this.f27367b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        Object A0;
        String str;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f27366a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
                A0 = obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            ListingChatViewModel listingChatViewModel = this.f27367b;
            this.f27366a = 1;
            A0 = listingChatViewModel.A0(this);
            if (A0 == f11) {
                return f11;
            }
        }
        ListingItemDetails listingItemDetails = (ListingItemDetails) A0;
        if (listingItemDetails != null) {
            ListingChatViewModel listingChatViewModel2 = this.f27367b;
            if (listingItemDetails.getId() != 0) {
                List<String> images = listingItemDetails.getImages();
                if (images != null) {
                    str = images.get(0);
                } else {
                    str = null;
                }
                String valueOf = String.valueOf(str);
                String b11 = listingChatViewModel2.z0().b();
                int catId = listingItemDetails.getCatId();
                String contact = listingItemDetails.getContact();
                if (contact == null) {
                    contact = listingItemDetails.getPhone();
                }
                listingChatViewModel2.I0(new ListingItemBrief(valueOf, b11, catId, contact, listingItemDetails.getDatePublished(), listingItemDetails.getDateSort(), listingItemDetails.getDoNotDisturb(), listingItemDetails.getId(), listingItemDetails.getImagesCount(), listingItemDetails.isHideMyNumber(), listingItemDetails.isAnon(), listingItemDetails.isPrem(), listingItemDetails.isVideoPaid(), listingItemDetails.isVoip(), listingItemDetails.getPrice(), listingItemDetails.getRegId(), listingItemDetails.getStatus(), listingItemDetails.getTitle(), listingItemDetails.getUrl(), listingItemDetails.getWasPromoted(), listingItemDetails.getPhone(), null, null, listingItemDetails.getDesc(), listingItemDetails.getExpireSoon(), listingItemDetails.getVirtualTourThumb(), null, null, 201326592, null));
                ListingUser user = listingItemDetails.getUser();
                listingChatViewModel2.J0(new UserProfileData(user.getId(), user.getName(), user.getPhone(), user.getImage(), kotlin.coroutines.jvm.internal.a.d(listingItemDetails.getId()), null, null, null, TypeExtensionsKt.W(user.getPhone()), 224, null));
                listingChatViewModel2.D0().k(user.getImage());
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((ListingChatViewModel$initData$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
