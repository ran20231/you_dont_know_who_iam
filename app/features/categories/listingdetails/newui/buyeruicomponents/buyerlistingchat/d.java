package com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.buyerlistingchat;

import com.forsale.app.base.viewmodels.BaseViewModel;
import com.forsale.app.datalayer.repositories.BaseRepository;
import kotlin.jvm.internal.o;
/* compiled from: ListingChatsViewModel.kt */
/* loaded from: classes2.dex */
public final class d extends BaseViewModel {

    /* renamed from: k0  reason: collision with root package name */
    private final String f27385k0;

    /* compiled from: ListingChatsViewModel.kt */
    /* loaded from: classes2.dex */
    public interface a {
        d a(String str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String str, BaseRepository baseRepository) {
        super(baseRepository);
        o.i(baseRepository, "baseRepository");
        this.f27385k0 = str;
    }

    public final String v0() {
        return this.f27385k0;
    }
}
