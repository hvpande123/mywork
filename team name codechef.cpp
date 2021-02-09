#include<bits/stdc++.h>
#define ll long long int
using namespace std;
void solve()
{
    ll n;
    cin>>n;
    string a[n];
    for(ll i=0;i<n;i++)
    {
        cin>>a[i];
    }
    sort(a,a+n);
    string p,q;
    ll ans=0;
    for(ll i=0;i<n;i++)
    {
        for(ll j=i+1;j<n;j++)
        {
            p=a[i];
            q=a[j];
            swap(p[0],q[0]);
            if(p[0]==q[0])
            {

            }
            else if(p==q)
            {

            }
            else if((!(binary_search(a,a+n,p)))&&(!binary_search(a,a+n,q)))
            {
                ans+=2;
            }
        }
    }
    cout<<ans<<"\n";
}
int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
#ifndef ONLINE_JUDGE
    freopen("input.txt","r",stdin);
    freopen("output.txt","w",stdout);
#endif
    ll t;
    cin>>t;
    while(t--)
    {
        solve();
    }
}
