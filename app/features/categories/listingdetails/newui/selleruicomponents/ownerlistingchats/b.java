package com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.ownerlistingchats;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.k0;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.o;
/* compiled from: ListingChatFragmentsViewPagerAdapter.kt */
/* loaded from: classes2.dex */
public final class b extends k0 {

    /* renamed from: j  reason: collision with root package name */
    private final List<Pair<String, Fragment>> f27857j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(FragmentManager fm2, List<? extends Pair<String, ? extends Fragment>> tabsTitleFragmentList) {
        super(fm2);
        o.i(fm2, "fm");
        o.i(tabsTitleFragmentList, "tabsTitleFragmentList");
        this.f27857j = tabsTitleFragmentList;
    }

    @Override // androidx.viewpager.widget.a
    public int d() {
        return this.f27857j.size();
    }

    @Override // androidx.viewpager.widget.a
    public CharSequence f(int i11) {
        return this.f27857j.get(i11).c();
    }

    @Override // androidx.fragment.app.k0
    public Fragment t(int i11) {
        return this.f27857j.get(i11).d();
    }
}
